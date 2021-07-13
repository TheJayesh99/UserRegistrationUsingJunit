package UserRegistrationJunit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class UserRegistrationTest 
{
	UserRegistrationService validator = new UserRegistrationService();
	//checking conditions for first name
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() 
	{
		assertTrue(validator.checkFirstName("Abcd"));			
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() 
	{
		assertFalse(validator.checkFirstName("Ab"));			
	}

	@Test
	public void givenFirstName_WhenFirstNotInUpperCase_ShouldReturnFalse() 
	{
		assertFalse(validator.checkFirstName("abcd"));			
	}

	//checking conditions for last name
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() 
	{
		assertTrue(validator.checkLastName("Abcd"));			
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() 
	{
		assertFalse(validator.checkLastName("Ab"));			
	}
	
	@Test
	public void givenLastName_WhenFirstNotInUpperCase_ShouldReturnFalse() 
	{
		assertFalse(validator.checkLastName("abcd"));			
	}
	
	//checking conditions for email
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue()
	{
		assertTrue(validator.checkEmailAddress("abc.xyz@bridgelabz.co.in"));
	}

	@Test
	public void givenEmail_WithoutUserName_ShouldReturnFalse()
	{
		assertFalse(validator.checkEmailAddress("@bridgelabz.co.in"));
	}

	@Test
	public void givenEmail_WithoutDomainName_ShouldReturnFalse()
	{
		assertFalse(validator.checkEmailAddress("abc.xyzco.in"));
	}
	
	@Test
	public void givenEmail_WithoutDomain_ShouldReturnFalse()
	{
		assertFalse(validator.checkEmailAddress("abc.xyz@bridgelabz"));
	}

	@Test
	public void givenEmail_WithoutOptinalUserName_ShouldReturnTrue()
	{
		assertTrue(validator.checkEmailAddress("abc@bridgelabz.co.in"));
	}

	@Test
	public void givenEmail_WithoutOptinalDomain_ShouldReturnTrue()
	{
		assertTrue(validator.checkEmailAddress("abc.xyz@bridgelabz.com"));
	}
	
}