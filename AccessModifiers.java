import java.util.*;

public class AccessModifiers{

		

		
	public static String emailCheck(){


		Scanner sc = new Scanner(System.in);

		String email, result;

		System.out.println("Enter your email:");
		email = sc.nextLine();
		String result;
		if(email.contains("@gmail.com")){
			
			result = "given"+email+"is an email";
		
			System.out.println(result);
		}else {

		result = "given" +email+ "is not an email please check";

		}
	
			return result;

		}
		

		
public static void main(String[] args ){

	
	emailCheck();
	
	
}

}

		
			
	
			