class A extends Thread
{
	public void run()
	{

		int a=10,b=7;
		System.out.println("Thread A - Addition"+(a+b));
	}
	System.out.println("Exit from ThreadA");
}
class B extends Thread
{
	public void run()
	{

		int a=10,b=7;
		System.out.println("Thread B - Subtraction"+(a-b));
	}
	System.out.println("Exit from ThreadB");
}
class C extends Thread
{
	public void run()
	{

		int a=10,b=7;
		System.out.println("Thread C - Multiplication"+(a*b));
	}
	System.out.println("Exit from ThreadC");
}
class D extends Thread
{
	public void run()
	{

		int a=10,b=7;
		System.out.println("Thread D - Division"+(a/b));
	}
	System.out.println("Exit from ThreadD");
}
class MultiThread
{
	public static void main(String args[])
	{
			A a1 = new A();
			B b1 = new B();
			C c1 = new C();
			D d1 = new D();

			a1.start();
			b1.start();
			c1.start();
			d1.start();


	}
}