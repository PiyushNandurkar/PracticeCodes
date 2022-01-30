
public class StaticVar1 {
	int Empid;
	char name;
	static String dept="L&T";
	
static void change()
	{
	 	dept="Eng";
	}
StaticVar1(int e,char n)
	{
		Empid=e;
		name=n;
	}
void Display()
	{
		System.out.println("Empid : "+Empid+" \n Emp_name : "+name+" \n Dept : "+dept);
	}
	
	public static void main(String[] args) {
		StaticVar1.change();
		/*StaticVar1 var1 =new StaticVar1();
		StaticVar1 var2 =new StaticVar1();
		var1.Display();
		var2.Display();*/
	}

}
