package models;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

public class User extends Model{
	static String usr = "admin";
	
	@Required
	public String label;
	
	public User(){
		
	}
	
	public static void chkUser(){
		
	}
	
	public static void createUser(User usr){
		
	}
}
