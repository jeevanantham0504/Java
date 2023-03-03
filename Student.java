class Student{

	int rollno;
	String name;
	static String college = "ITS";
	
	static void change(){
	college = "BBDIT";
	}
	
	Student(int r,String n){
	rollno = r;
	name = n;
	}
		
	void display(){
		System.out.println(rolllno""+name+""college);
	}

	
}

public class TestStaticMethod{
public static void main(String[] args){

	Student.change();

	Student s1 = new Student(111,"Karan");
	Student s2 = new Student(222,aryan");
	Student s3 = new Student(111,"sonoo");

	
		s1.display();
		s2.display();
		s3.display();

	}

}