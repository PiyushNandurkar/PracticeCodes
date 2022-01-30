import java.util.Scanner;

public class Automorphic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check");
		int n = sc.nextInt();
		int temp1 = n * n;
		int temp2 = n;
		while (n > 0) {
			int u = temp1 % 10;
			//System.out.println(u);
			if (u == temp2) {
				System.out.println(u+" "+temp2);
				System.out.println("Number is automorphic");
				break;
			}
			else
			{
				System.out.println("Number is not automorphic");
				break;
			}
		}
	}
}
