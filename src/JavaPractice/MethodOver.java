package JavaPractice;
class A{
	static{
		System.out.println("Static block parent");//1
	}
	{
		System.out.println("Init block parent");//2
	}
	
	public void m1(){
		System.out.println("parent method");//3
	}
	A(){
		System.out.println("Parent constructor");
	}
}
class B extends A{
	static{
		System.out.println("Static block child");//2
	}
	{
		System.out.println("Init block Child");//4
	}
	
	public void m1(){
		System.out.println("Child method");//6
	}
	B(){
		System.out.println("Child constructor");//5
	}
}
public class MethodOver {
	public static void main(String[] args) {
		A a=new B();
		//a.m1();*/
		System.out.println("===================================");
		A a2=new A();
/*		a2.m1();*/
		System.out.println("===================================");
		new A();
		System.out.println("===================================");
		new A();
		System.out.println("===================================");
		new A();
		
	}
}
