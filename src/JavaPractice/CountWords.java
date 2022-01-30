package JavaPractice;

import java.util.HashMap;
import java.util.Map;

public class CountWords {

	public static void main(String args[]) {
		
		String s = "Hi i was Born in Maharashtra Maharashtra";
		String as[]=s.split(" ");
		Map<String,Integer> map=new HashMap<String,Integer>();
		Integer count=1;
		
		for(int i=0;i<as.length;i++){
			if(!map.containsKey(as[i])){
				map.put(as[i], count);
			}else{
				map.put(as[i],map.get(as[i])+1);
			}
			
		}
		
		for(String k:map.keySet()){
			System.out.println("The count of words : "+k+" = "+map.get(k));
		}
		
		
	}
}
