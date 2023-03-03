import java.util.*;

class  ScannerExample{

public static void main(String[] args){

 System.out.println("Enter your Name");

 Scanner input = new Scanner(System.in);

 String name = input.nextLine();

 System.out.println(name);



System.out.println("Enter your Initial");
 
String initial = input.next();

System.out.println(initial);


System.out.println("Enter your Number");
 
long number = input.nextLong();

System.out.println(number);

}


}