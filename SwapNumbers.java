public class SwapNumbers{
public static void main(String[] args){

	

int a = 67,b = 56,c;
	

/*SWAPING TWO NUMBERS USING THIRD VARIABLE

	c = a;
	a = b;
 	b = c;
	
	System.out.println(a);
	System.out.println(b);*/
	
//SWAPING TWO NUMBERS WITHOUT USING THIRD VARIABLE

 	b=b-a;
	a=a+b;
	b=a-b;
	System.out.println(a);
	System.out.println(b);

	

}
}