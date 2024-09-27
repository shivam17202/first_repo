package collections;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		String str="Shivam Sharma";
		
		HashMap <Character,Integer> map=new HashMap<>();
		for(int i=0; i<str.length();i++) {
		//	System.out.println(str.charAt(i));
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		for(Map.Entry entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
}
