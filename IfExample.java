import java.util.*;

class IfExample{

public static void main(String[] args){


Scanner input = new Scanner(System.in);
System.out.println("Enter the Password");

int a = input.nextInt();



int b = 12345678;
 


if(a==b){

System.out.println("condition 1 satisfied");

if(a!=1234){System.out.println("nestedif satisfied");
}


}
else if(a==123){

System.out.println("condition 2 satisfied");


}
else{

System.out.println("both are not satisfied");

}







}

}