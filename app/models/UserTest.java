package models;

import static org.junit.Assert.*;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.inMemoryDatabase;

import org.junit.Before;
import org.junit.Test;

import play.test.WithApplication;

public class UserTest extends WithApplication {
	@Before
	public void setUp() {
		start(fakeApplication(inMemoryDatabase()));
	}
	
	@Test
    public void createAndRetrieveUser() {
        new User("Sulya", "abs123", "sulya@gmail.com").save();
        User sulya = User.find.where().eq("email", "sulya@gmail.com").findUnique();
        assertNotNull(sulya);
        assertEquals("Sulya", sulya.name);
    }
	
	@Test
    public void tryAuthenticateUser() {
        new User("Sulya", "abc123", "sulya@gmail.com").save();
        
        assertNotNull(User.authenticate("sulya@gmail.com", "abc123"));
        assertNull(User.authenticate("sulya@gmail.com", "otherpassword"));
        assertNull(User.authenticate("vova@gmail.com", "abc123"));
    }
}
