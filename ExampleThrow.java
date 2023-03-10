import com.jeevanantham.Class1;

public class ExampleThrow {


public static void validate(int age){


	if (age <=18){
throw new ArithmeticException("Thambi nee inum valaranum!!");
}else{

System.out.println("Alright !! mark your presence to change the world on ");
}
}

public static void main(String args[]){

Class1 obj1 = new Class1();

obj1.method1();

validate(23);

System.out.println("main method");











}
}
