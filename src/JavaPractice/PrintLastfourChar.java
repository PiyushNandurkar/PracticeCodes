package JavaPractice;

public class PrintLastfourChar {
	public static void main(String[] args) {
		String s="aaa bbb bbb bbb bbbs sss sss";
		s=s.replace(" ","");
		String lastfour=s.substring(s.length()-4,s.length());
		System.out.println(lastfour);
	}
}
