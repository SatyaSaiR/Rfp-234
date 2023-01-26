package Day20;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegisteration {

	 public static boolean userFirstName(String firstName) {

		        String firstNamePattern = "[A-Z]{1}[a-z]{2,}";

		        Pattern pattern = Pattern.compile(firstNamePattern);
		        Matcher matcher = pattern.matcher(firstName);
		        boolean result = matcher.matches();
		        return result;

		    }

		    public static boolean userLastName(String lastName) {

		        String lastNamePattern = "[A-Z]{1}[a-z]{5,}";

		        Pattern pattern1 = Pattern.compile(lastNamePattern);
		        Matcher matcher1 = pattern1.matcher(lastName);
		        boolean result1 = matcher1.matches();
		        return result1;
		    }

		    public static boolean userEmail(String email) {
		        String emailPattern = "^[a-zA-Z0-9][a-zA-Z-0-9_+]*([.][a-zA-Z0-9]+)?[@][a-zA-Z-0-9]+[.][a-z]{2,4}([.][a-zA-Z]{2,4})?$";

		        Pattern pattern2 = Pattern.compile(emailPattern);
		        Matcher matcher2 = pattern2.matcher(email);
		        boolean result2 = matcher2.matches();
		        return result2;

		    }

		    public static boolean mobileNumberValidation(String phoneNumber) {
		        Scanner scanner = new Scanner(System.in);
		        String MobileNumberPattern = "^[+](91)\\s[6-9][0-9]{9}$";

		        Pattern pattern3 = Pattern.compile(MobileNumberPattern);
		        Matcher matcher3 = pattern3.matcher(phoneNumber);
		        Boolean result3 = matcher3.matches();
		        return result3;
		    }

}

