package controllers;

import play.mvc.*;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;


import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;

// Imports model class
import models.*;
import models.users.*;

// Imports views
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    // Declaring a private FormFactory instance
    private FormFactory formFactory;

    private Environment e;
    // Injecting an instance of FormFactory into the controller via its constructor
    @Inject
    public HomeController(FormFactory f, Environment env){
        this.e = env;
        this.formFactory = f;
    }
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

  

    public Result games(Long cat) {

        List<Product> productList = null;

        List<Category> categoryList = Category.findAll();

        if (cat == 0){
            productList = Product.findAll();
        } else {
            productList = Category.find.ref(cat).getProducts();
        }
        return ok(games.render(productList, categoryList, User.getUserById(session().get("email")),e));
    }

    public Result index(){
        return ok(index.render(User.getUserById(session().get("email"))));
    }

    public Result about(){
        return ok(about.render(User.getUserById(session().get("email"))));
    }

    public Result employee(){
         List<Employee> employeeList = Employee.findAll();

         return ok(employee.render(employeeList, User.getUserById(session().get("email"))));
    }

    public Result addEmployee(){

        Form<Employee> employeeForm = formFactory.form(Employee.class);

        return ok(addEmployee.render(employeeForm, User.getUserById(session().get("email"))));
    }


    public Result addEmployeeSubmit(){
        Form<Employee> newEmployeeForm = formFactory.form(Employee.class).bindFromRequest();

        // Check for erroors (based on constraints set in the Product class)
        if(newEmployeeForm.hasErrors()) {
            // Display the form again by returning a bad request
            return badRequest(addEmployee.render(newEmployeeForm, User.getUserById(session().get("email"))));
        } else {
            // No errors found - extract the product detail from the form
            Employee newEmployee = newEmployeeForm.get();

            // Save the object to the Products table in the database
            newEmployee.save();

            // Set a success message to flash (for display in return view)
            flash("success", "Employee " + newEmployee.getName() + " was added");

            // Redirect to the index page
            return redirect(controllers.routes.HomeController.employee());
        }
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addProduct(){

        // Create a form by wrapping the Product Class
        // in a FormFactory form instance
        Form<Product> productForm = formFactory.form(Product.class);

        return ok(addProduct.render(productForm, User.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result deleteProduct(Long id){

        Product.find.ref(id).delete();

        flash("success", "Product has been deleted");

        return redirect(routes.HomeController.games(0));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result updateProduct(Long id){

        Product p;
        Form<Product> productForm;

        try{
            p = Product.find.byId(id);

            productForm = formFactory.form( Product.class).fill(p);

        } catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addProduct.render(productForm, User.getUserById(session().get("email"))));
    }

    public Result addProductSubmit(){
        String saveImageMsg;
        // Retrieve the submitted form object( bind from the HTTP request)
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        // Check for erroors (based on constraints set in the Product class)
        if(newProductForm.hasErrors()) {
            // Display the form again by returning a bad request
            return badRequest(addProduct.render(newProductForm, User.getUserById(session().get("email"))));
        } else {
            // No errors found - extract the product detail from the form
            Product newProduct = newProductForm.get();

            if(newProduct.getId() == null){
                // Save the object to the Products table in the database
                newProduct.save();

                flash("success", "Product " + newProduct.getName() + " was added");

            } else if (newProduct.getId() != null) {
                // Product Exists
                newProduct.update();

                flash("success", "Product " + newProduct.getName() + " was updated");
            }


            MultipartFormData data = request().body().asMultipartFormData();
            FilePart image = data.getFile("upload");

            saveImageMsg = saveFile(newProduct.getId(), image);

            flash("success", "Product " + newProduct.getName() + " was added" + saveImageMsg);
            // Set a success message to flash (for display in return view)
            

            // Redirect to the index page
            return redirect(controllers.routes.HomeController.games(0));
        }


    }

    public String saveFile(Long id, FilePart<File> uploaded) {
        // make sure that the file exists
        if (uploaded != null) {
            // make sure that the content is indeed an image
            String mimeType = uploaded.getContentType(); 
            if (mimeType.startsWith("image/")) {
                // get the file name
                String fileName = uploaded.getFilename();                
                // save the file object (created without a path, File saves
                // the content to a default location, usually the temp or tmp
                // directory)
                File file = uploaded.getFile();
                // create an ImageMagik operation - this object is used to specify
                // the required image processing
                IMOperation op = new IMOperation();
                // add the uploaded image to the operationop.addImage(file.getAbsolutePath());
                op.addImage(file.getAbsolutePath());
                // resize the image using height and width saveFileOld(Long id, FilePart<File> uploaded) {
                op.resize(600, 500);
                // save the image as jpg 
                op.addImage("public/images/productImages/" + id + ".png");
                // create another Image Magick operation and repeat the process above to
                // specify how a thumbnail image should be processed - size 60px
                IMOperation thumb = new IMOperation();
                thumb.addImage(file.getAbsolutePath());
                thumb.resize(200);
                thumb.addImage("public/images/productImages/thumbnails/" + id + ".png");
                // we must make sure that the directories exist before running the operations
                File dir = new File("public/images/productImages/thumbnails/");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                // now we create an Image Magick command and execute the operations
                ConvertCmd cmd = new ConvertCmd();
                try {
                    cmd.run(op);
                    cmd.run(thumb);
                } catch(Exception e) {
                    e.printStackTrace();
                }
                return " and image saved";
            }
        }
        return "/ no file";
    }

}
