
public class InsStaVari {

	static{
		System.out.println("Static init block 1");
	}
	
	public InsStaVari(){
		System.out.println("I am method 1");
	}
	{
		System.out.println("im instance block 1");
	}
	public static void main(String[] args) {
		InsStaVari i=new InsStaVari();
				

	}

}
