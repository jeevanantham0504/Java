import java.util.*;
public class SimpleCalculator{
public static void main(String[] args){

	//SIMPLE CALCULATOR

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the operator to Work - Use only +,-,*,/,%");
	String a = sc.nextLine();
		int b; 
		int c;

	int d;
	
	
	

	switch(a){
	case "+":
	System.out.println("Enter the value 1: ");
	b = sc.nextInt();
	System.out.println("Enter the value 2: ");
	c = sc.nextInt();
	d=b+c;
	System.out.println("the addition of two values are "+d);
	break;

	case "-":
	System.out.println("Enter the value 1: ");
	b = sc.nextInt();
	System.out.println("Enter the value 2: ");
	c = sc.nextInt();
	d=b-c;
	System.out.println("the subraction of two values are "+d);
	break;

	case "*":
	System.out.println("Enter the value 1: ");
	b = sc.nextInt();
	System.out.println("Enter the value 2: ");
	c = sc.nextInt();
	d=b*c;
	System.out.println("the product of two values are "+d);
	break;

	case "/":
	System.out.println("Enter the value 1: ");
	b = sc.nextInt();
	System.out.println("Enter the value 2: ");
	c = sc.nextInt();
	d=b/c;
	System.out.println("the division of two values are "+d);
	break;

	case "%":
	System.out.println("Enter the value 1: ");
	b = sc.nextInt();
	System.out.println("Enter the value 2: ");
	c = sc.nextInt();
	d=b%c;
	System.out.println("the remainder of two values are "+d);
	break;
	
	default:
	System.out.println("the number");
	}

			













}
}