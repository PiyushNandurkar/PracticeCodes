import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check");
		int n=sc.nextInt();
		int temp,sum=0,r;
		
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The numner is not palindrome");
		}
	}
}
