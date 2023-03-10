import java.util.*;

 class Copy
{
int id;
String name;
Copy(int i,String n){
id = i;
name = n;
}
CopyCopys){
id = s.id;
name =s.name;
}
void display()
{
  System.out.println(id+" "+name);
}
 class CopyConstructer{
   public static void main(String args[])
{
   Copy s1 = new Copy(111,"Karan");
    Copy s2 = new Copy(s1);
   s1.display();
   s2.display();
}
}