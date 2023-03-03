import java.util.*;
class Marks{

public static void main(String args[]){


Scanner input = new Scanner(System.in);
System.out.println("Enter you marks");
int a = input.nextInt();

if(a<35){
System.out.println("grade c");
}
else if(a>=35&&a<=60){
System.out.println("grade B");
}
else if(a>60&&a<=85){
System.out.println("grade A");
}
else if(a>85&&a<=100){
System.out.println("grade A+");
}
else if(a>100){
System.out.println("Invalid");

}



}
}