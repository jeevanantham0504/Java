// finonacci series - sum of previous numbers  - 
class Fib
{
	int n1=0,n2=1,n3;
	void display()
	{
		n3 = n1+n2;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		for(int i=0;i<50;i++)
		{
			n1 = n2;
			n2 = n3;
			n3 = n1+n2;

			System.out.println(n3);

		}
	}
}
class MainA
{
		public static void main(String[] args)
		{
				Fib obj = new Fib();
				obj.display();

		}
}
	