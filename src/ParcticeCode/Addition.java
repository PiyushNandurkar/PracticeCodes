package ParcticeCode;

import java.util.Scanner;

public class Addition {
	
	static void Add(int a, int b){
		System.out.println("Addidtion : "+(a+b));		
	}
	
	static void Sub(int a,int b){
		System.out.println("Substraction : "+(a-b));
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value 1 : ");
		int x=sc.nextInt();
		System.out.println("Enter Value 2 : ");
		int y=sc.nextInt();
		
		Add(x,y);
		Sub(x,y);
	}

}
