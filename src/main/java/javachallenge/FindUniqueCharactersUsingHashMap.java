package javachallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindUniqueCharactersUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "lead automation engineer";
		Map<Character,Integer> hmap=new HashMap<Character,Integer>();
		for(int i=0;i<=str.length()-1;i++) {
			if(hmap.containsKey(str.charAt(i))) {
				int count=hmap.get(str.charAt(i))+1;
				hmap.put(str.charAt(i), count);
			}
			
			else {
				hmap.put(str.charAt(i), 1);
			}
		}
		System.out.println("Duplicate elements are ");
		for(Map.Entry<Character, Integer>entry: hmap.entrySet()) {
		if(entry.getValue()==1) {
			System.out.println(entry.getKey());
				
			}
		
		}
	}
	}


