package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import models.*;

import views.html.*;

public class Application extends Controller {

	//static Form<User> loginForm = Form.form(User.class);

	public static Result index() {
		return ok(index.render(" to Play Test"));
	}

	/*public static Result login() {
		return ok(login.render());
	}*/
}
