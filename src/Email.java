
import java.util.regex.*;
import java.util.*;
public class Email{
	
	public static boolean isValid(String email)
{
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
	if (email == null)
		return false;
		return pattern.matcher(email).matches();
}
public static void main(String args[]){
		String email = "kuldeep@gmail.com";
		boolean result = isValid(email);
	if (result == true)
		System.out.println("Provided email address "+ email+ " is valid \n");
	else
		System.out.println("Provided email address "+ email+ " is invalid \n");
}
}