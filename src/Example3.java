import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How mainy Fibonacci series numbers : ");
		int num=sc.nextInt();
		FibonacciSeries(num);
		sc.close();
	}
	
	static void FibonacciSeries(int n){
		int x=0,y=1,z=0,count=1;
		while(count<=n){
			System.out.println(z+" ");
			z=x+y;
			x=y;
			y=z;
			count++;
		}
	}
	
}
