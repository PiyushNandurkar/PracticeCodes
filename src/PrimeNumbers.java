import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		int i,m=0,flag=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		m=n/2;
		if(n==1||n==0)
		{
			System.out.println("Number is not prime");
		}
		else
		{
			for(i=2;i<m;i++)
			{
				if(n%i==0)
				{
					System.out.println("Number is not Prime");
					flag=1;
					break;
				}
			}
			if(flag==0)
			System.out.println("Number is prime");
		}
	}
}
