public class Test1{
	
	public static void main(String args[]){
		String s="Hi piyush where are you from";
		int count=0;
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) ==' '){
				count++;
			}
		}
		System.out.println(count);
		
	}
	
}