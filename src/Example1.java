import java.util.Scanner;

public class Example1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		int n1=sc.nextInt();
		
		System.out.println("Enter Second number : ");
		int n2=sc.nextInt();
		
		System.out.println("Enter required operation [+,-,*,/]: ");
		char operator=sc.next().charAt(0);
		
		if(operator=='+' || operator=='-' || operator=='*' || operator=='/')
		{
		int result= cal(n1,n2,operator);
		System.out.println(n1+" "+operator+" "+n2+" = "+result);
		sc.close();
		}else{
			System.out.println("Invalid operator... Please enter valid operator...");
		}
	}
	static int cal(int x,int y, char operator){
		int res=0;
		switch(operator)
		{
		case '+':
			res=x+y;
			break;
		case '-':
			res=x-y;
			break;
		case '*':
			res=x*y;
			break;
		case '/':
			res=x/y;
		}
		return res;
	}
	
}