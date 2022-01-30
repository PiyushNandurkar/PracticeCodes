import java.util.Scanner;

//palindrome number Code

class Practice {
	public static void main(String[] args) {
		int i,fact=1;
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.println("Factorial of number is  : "+fact);
	} 
}