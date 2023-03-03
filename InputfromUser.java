import java.util.*;

public class InputfromUser{
public static void main(String[] args){

	Scanner a = new Scanner(System.in);
		
		System.out.println("\n");
		System.out.println("What is your name");
		String name = a.nextLine();

		System.out.println("\n");
		System.out.println("what is your age");
		int age = a.nextInt();
		
		/*this below line is for printing the food because we have used nextint before this so after giving a nextint we have to use 
		  this line for printing the string correctly*/
		a.nextLine();
		
		System.out.println("\n");
		System.out.println("What is your favourite food");
		String food = a.nextLine();
		
			
			System.out.println("\n");
			System.out.println("Hello "+name+",");
			System.out.println("You are "+age+",");
			System.out.println("You love "+food+".");

	
	







}
}