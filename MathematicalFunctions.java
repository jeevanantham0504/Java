import java.util.*;
public class MathematicalFunctions{
public static void main(String[] args){


	//double x = 3.14;
	//double y = -10;

	//double z = Math.max(x,y);
	//double z = Math.max(x,y);
	//double z = Math.abs(y);
	//double z = Math.sqrt(y); 
	//double z = Math.round(y);
	//double z = Math.ceil(y); 
	//double z = Math.floor(y); 
	//System.out.println(z);


/*WE ARE GOING TO GIVE TWO SIDES OF A TRIANGLE AND FIND THE ANOTHER THIRD SIDE USING THE HYPOTENUOUS FORMULA C=SQUAREROOT OF A SQUARE+B SQUARE*/


	double x;
	double y;
	double z;

	Scanner input = new Scanner	(System.in);
	
	System.out.println("Enter the side of x");
	x = input.nextDouble();

	System.out.println("Enter the side of Y");
	y = input.nextDouble();

	z = Math.sqrt((x*x)+(y*y));
	System.out.print("The third side is : "+z);





}
}