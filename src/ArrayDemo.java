
class A{
	public void m1(){
		System.out.println("Im in parent");
	}
	public void m2(){}
	
}
class B extends A{
	public void m2(){
	System.out.println("Im in Child");
	}
}


public class ArrayDemo
{
    public static void main(String args[])
    {
       A a=new B();
       a.m1();
       a.m2();
    }
}