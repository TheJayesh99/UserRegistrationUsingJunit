package UserRegistrationJunit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UserRegistrationTest 
{
	//checking conditions for first name
	@Test
	public void givenFirstName_WhenProper_ShouldReturnValid() 
	{
		UserRegistrationService firstNamevalidator = new UserRegistrationService();
		assertTrue(firstNamevalidator.checkFirstName("Abcd"));			
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnValid() 
	{
		UserRegistrationService firstNamevalidator = new UserRegistrationService();
		assertFalse(firstNamevalidator.checkFirstName("Ab"));			
	}

	@Test
	public void givenFirstName_WhenFirstNotInUpperCase_ShouldReturnValid() 
	{
		UserRegistrationService firstNamevalidator = new UserRegistrationService();
		assertFalse(firstNamevalidator.checkFirstName("abcd"));			
	}

	//checking conditions for last name
	@Test
	public void givenLastName_WhenProper_ShouldReturnValid() 
	{
		UserRegistrationService lastNamevalidator = new UserRegistrationService();
		assertTrue(lastNamevalidator.checkLastName("Abcd"));			
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnValid() 
	{
		UserRegistrationService lastNamevalidator = new UserRegistrationService();
		assertFalse(lastNamevalidator.checkLastName("Ab"));			
	}
	
	@Test
	public void givenLastName_WhenFirstNotInUpperCase_ShouldReturnValid() 
	{
		UserRegistrationService lastNamevalidator = new UserRegistrationService();
		assertFalse(lastNamevalidator.checkLastName("abcd"));			
	}

}