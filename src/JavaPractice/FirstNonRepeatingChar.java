package JavaPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String s="Piyush";
		Map<Character,Integer> map=new LinkedHashMap<>();
		int count=1;
		for(int i=0;i<s.length();i++){
			
			if(!map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), count);
			}else{
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
		}
		
		for(Entry<Character,Integer> entry:map.entrySet()){
			if(entry.getValue()==1){
				System.out.println("The first non repeeating char = "+entry.getKey());
				break;
			}
		}
	}
}



