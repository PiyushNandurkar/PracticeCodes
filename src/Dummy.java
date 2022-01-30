import java.util.Scanner;

public class Dummy {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary");
		int sal = sc.nextInt();
		double tax = 0;
		double incometax = 0;
		if (sal <= 50000)
			System.out.println("IncomeTax Nil");
		 if (sal > 50001 && sal < 60000) {
			tax = 0.10;
			incometax = sal * tax;
			System.out.println("Tax on income");
			System.out.println(incometax);
			System.out.println("salary after income");
			System.out.println(sal-incometax);
		}  if (sal > 60000 && sal < 150000) {
			tax = 0.20;
			incometax = sal * tax;
			System.out.println("Tax on income");
			System.out.println(incometax);
			System.out.println("salary after income");
			System.out.println(sal-incometax);
		}  if (sal > 150000) {
			tax = 0.20;
			incometax = sal * tax;
			System.out.println("Tax on income");
			System.out.println(incometax);
			System.out.println("salary after income");
			System.out.println(sal-incometax);
		}

	}

}