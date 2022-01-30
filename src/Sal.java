import java.util.Scanner;

public class Sal {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int salary=sc.nextInt();
		
		if(salary<=10000)
		{
			double HRA=(0.20*salary);
			double DA=(0.80*salary);
			double temp=salary+HRA+DA;
			System.out.println("Gross Salary for employee is"+temp);
		}
		if(salary<=20000 && salary>10000)
		{
			double HRA=(0.25*salary);
			double DA=(0.90*salary);
			double temp=salary+HRA+DA;
			System.out.println("Gross Salary for employee is"+temp);
		}
		if(salary>20000)
		{
			double HRA=(0.30*salary);
			double DA=(0.95*salary);
			double temp=salary+HRA+DA;
			System.out.println("Gross Salary for employee is"+temp);
		}
		
	}
}
