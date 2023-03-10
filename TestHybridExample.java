class Human{
	public void showHuman(){
		System.out.println("Human Class");
	}
}
interface father{
	void show();
}
interface mother{
	void show();
}
class Child extends Human implements mother,father{
	public void show(){
		System.out.println("Invoking show Method");
	}
	public void showChild(){
		System.out.println("Invoking showChild() Method");
	}
}
class TestHybridExample{
	public static void main(String[] args){
		Child c = new Child();
		c.showHuman();
		c.showChild();
	}
}