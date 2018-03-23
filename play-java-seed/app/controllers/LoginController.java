package controllers;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

import models.users.*;

public class LoginController extends Controller {

    private FormFactory FormFactory;

    private Environment env;

    @Inject
    public LoginController(Environment e, FormFactory f) {
        this.env = e;
        this.FormFactory = f;
    }

    public Result login(){

        Form<Login> loginForm = FormFactory.form(Login.class);

        return ok(login.render(loginForm));
    }

    public Result loginSubmit(){

        Form<Login> loginForm = FormFactory.form(Login.class).bindFromRequest();

        if(loginForm.hasErrors()) {
            return badRequest(login.render(loginForm));
        } else {
            session().clear();

            session("email", loginForm.get().getEmail());
        }

        return redirect(controllers.routes.HomeController.games(0));
            
        
    }
}