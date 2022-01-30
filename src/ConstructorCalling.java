
class Parent{
	
	Parent(){
		System.out.println("Inside A");
	}
}

class Child extends  Parent{
	
	Child(){
		System.out.println("Inside B");
	}
}


public class ConstructorCalling {
	public static void main(String[] args) {
		Parent p=new Parent();
		System.out.println("============");
		Child c = new Child();
		System.out.println("============");
		Parent p1 = new Child();
		
	}
}
