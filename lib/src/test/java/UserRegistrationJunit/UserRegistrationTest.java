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
	
}