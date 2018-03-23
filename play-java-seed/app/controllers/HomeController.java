package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

// Imports model class
import models.*;

// Imports views
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    // Declaring a private FormFactory instance
    private FormFactory formFactory;

    // Injecting an instance of FormFactory into the controller via its constructor
    @Inject
    public HomeController(FormFactory f){
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
        return ok(games.render(productList, categoryList));
    }

    public Result index(){
        return ok(index.render());
    }

    public Result about(){
        return ok(about.render());
    }

    public Result employee(){
         List<Employee> employeeList = Employee.findAll();

         return ok(employee.render(employeeList));
    }

    public Result addEmployee(){

        Form<Employee> employeeForm = formFactory.form(Employee.class);

        return ok(addEmployee.render(employeeForm));
    }


    public Result addEmployeeSubmit(){
        Form<Employee> newEmployeeForm = formFactory.form(Employee.class).bindFromRequest();

        // Check for erroors (based on constraints set in the Product class)
        if(newEmployeeForm.hasErrors()) {
            // Display the form again by returning a bad request
            return badRequest(addEmployee.render(newEmployeeForm));
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

    public Result addProduct(){

        // Create a form by wrapping the Product Class
        // in a FormFactory form instance
        Form<Product> productForm = formFactory.form(Product.class);

        return ok(addProduct.render(productForm));
    }

    public Result deleteProduct(Long id){

        Product.find.ref(id).delete();

        flash("success", "Product has been deleted");

        return redirect(routes.HomeController.games(0));
    }

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

        return ok(addProduct.render(productForm));
    }
    public Result addProductSubmit(){
        
        // Retrieve the submitted form object( bind from the HTTP request)
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        // Check for erroors (based on constraints set in the Product class)
        if(newProductForm.hasErrors()) {
            // Display the form again by returning a bad request
            return badRequest(addProduct.render(newProductForm));
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

            // Set a success message to flash (for display in return view)
            

            // Redirect to the index page
            return redirect(controllers.routes.HomeController.games(0));
        }

        




    }

}
