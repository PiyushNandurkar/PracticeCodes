package JavaPractice;

import java.util.Scanner;

public class FibonaProgram {
	public static void main(String[] args) {
		// Fibonacci series next number is sum of previous two numbers
		// 0,1,1,2,3,5,8,13....etc

		int n1 = 0, n2 = 1, n3;
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		System.out.println(n1 + "\n" + n2);

		for (int i = 1; i < count; i++) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;

		}

	}
}
