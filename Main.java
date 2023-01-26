package Day20;
import org.junit.Test;
	//import static org.junit.Assert.*;

import org.junit.Assert;

	 
		 public class Main {
		@Test
		public void toCheck_GivenFirstNameIsValid() {
			UserRegisteration user = new UserRegisteration();
			boolean result = user.userFirstName("Sai");
			Assert.assertEquals(true, result);
		}

		@Test
		public void givenFirstName_ShouldReturnFalse() {
			UserRegisteration user = new UserRegisteration();
			boolean result1 = user.userFirstName("R");
			Assert.assertEquals(false, result1);
		}

		@Test
		public void givenLastName_ShouldReturnTrue() {
			UserRegisteration user = new UserRegisteration();
			boolean result = user.userLastName("prakash");
			Assert.assertEquals(false, result);
		}

		@Test
		public void givenLastName_ShouldReturnFalse() {
			UserRegisteration user = new UserRegisteration();
			boolean result = user.userLastName("Sa");
			Assert.assertEquals(false, result);
		}

		@Test
		public void givenMobileNumber_ShouldReturnTrue() {
			UserRegisteration user = new UserRegisteration();
			boolean result = user.mobileNumberValidation("+91 7981479260");
			Assert.assertEquals(true, result);
		}

		@Test
		public void givenMobileNumber_ShouldReturnFalse() {
			UserRegisteration user = new UserRegisteration();
			boolean result = user.mobileNumberValidation("798");
			Assert.assertEquals(false, result);
		}

		@Test
		public void givenEmail_ShouldReturnTrue() {
			UserRegisteration user = new UserRegisteration();
			boolean result = user.userEmail("sai@gmail.com");
			Assert.assertEquals(true, result);
		}
}
	
