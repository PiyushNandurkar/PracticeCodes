package JavaPractice;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s="stop";
		String s2="pots";

		
		char[] s1=s.toLowerCase().toCharArray();
		char[] st2=s2.toLowerCase().toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(st2);
		
		if(Arrays.equals(s1, st2)==true){
			System.out.println("string anagram");
		}else{
			System.out.println("not anagram");
		}
	}
	
}
