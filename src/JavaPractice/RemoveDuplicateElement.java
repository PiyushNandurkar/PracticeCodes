package JavaPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveDuplicateElement {

	public static void main(String args[]) {
		String a = "ssbbzddffgggllmmnfqnook";
		char ch[] = a.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int count = 1;

		for (int i = 0; i < ch.length; i++) {
			if (!map.containsKey(ch[i])) {
				map.put(ch[i], count);
			} else {
				map.put(ch[i], map.get(ch[i]) + 1);
			}
		}
		Iterator<Character> it = map.keySet().iterator();
		while (it.hasNext()) {
			Character key = it.next();
			Integer value = map.get(key);
			if (value > 2) {
				System.out.println(" " + key + ":" + value + " ");
			}
		}

		// ========================================================================
		System.out.println("");
		System.out.println("=============================");
		for (Character key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.print(key + ":" + map.get(key));
			}
		}

		System.out.println("");
		System.out.println("=============================");
		for (Character key : map.keySet()) {
			if (map.get(key) == 1) {
				System.out.print(key + "" + map.get(key));
			}
		}
	}

}
