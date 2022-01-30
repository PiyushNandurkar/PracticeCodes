package JavaPractice;

public class sortChar {

	static void methodToSort(char ch[]) {
		char temp;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]>ch[j]){
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}

		}
		System.out.println(new String(ch));
	}

	public static void main(String[] args) {
		String s = "maharashtra";
		char[] ch1 = s.toCharArray();

		methodToSort(ch1);
	}

}
