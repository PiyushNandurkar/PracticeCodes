package JavaPractice;

import java.util.Arrays;

public class AscOrder {
	static void sort(String str[], int n) {
		for (int i = 0; i < n; i++) {
			String temp = str[i];
			int j = i - 1;
			while (j >= 0 && temp.length() < str[j].length()) {
				str[j + 1] = str[j];
				j--;
			}
			str[j + 1] = temp;
		}
	}

	static void printArrayString(String str[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(str[i] + " " + str[i].length());
		}
	}

	public static void main(String[] args) {

		String s = "hi i am from mumbai";
		String arr[] = s.split(" ");
		int n = arr.length;

		sort(arr, n);
		printArrayString(arr, n);

	}
}
