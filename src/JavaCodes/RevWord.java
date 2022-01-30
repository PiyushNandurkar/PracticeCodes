package JavaCodes;

public class RevWord {

	static String reverseWord(String str) {

		String[] temp = str.split("\\s");
		String result = "";

		for (int i = 0; i < temp.length; i++) {
			if (i == temp.length - 1) {
				result = temp[i] + result;
			} else {
				result = " " + temp[i] + result;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String s = "Hi i am from Mumbai";
		System.out.print(reverseWord(s));
	}
}
