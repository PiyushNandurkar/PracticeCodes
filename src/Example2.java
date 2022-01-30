import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check the Factorial");
		int num = sc.nextInt();
		Example2 e=new Example2();
		int fact=e.Fact(num);
		System.out.println("Factorial of "+num+" = "+ fact);
	}

	int Fact(int n) {
		int fact = 1;
		while (n > 0) {
			fact = fact * n;
			n--;
		}
		return fact;
		//System.out.println(fact);
	}
}
