package ParcticeCode;

class AscOrder2{
	public static void main(String args[]){
		String s="Hi i im from Maharashtra India";
		String str[]=s.split(" ");
		int n=str.length;
		
		for (int i = 0; i < n; i++) {
			String temp = str[i];
			int j = i - 1;
			while (j >= 0 && temp.length() < str[j].length()) {
				str[j + 1] = str[j];
				j--;
			}
			str[j + 1] = temp;
		}
		
		for(int i=0;i<n;i++){
			System.out.print(str[i]+" ");
		}
	}	
}
