package JavaPractice;

import java.util.Scanner;

class FiboRecurr {
	static int n3 = 0;
	int n1=0,n2=1;
	public void PrintFibo(int count) {
		if(count>0){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(" "+n3);
			PrintFibo(count-1);
		}
	}

}

public class FibonacciRecur {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 1;
		int count = sc.nextInt();
		System.out.println(" "+n1+"\n "+n2);
		FiboRecurr Fb=new FiboRecurr();
		Fb.PrintFibo(count-2);
	}
}
