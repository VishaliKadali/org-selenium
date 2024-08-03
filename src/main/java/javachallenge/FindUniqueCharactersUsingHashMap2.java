package javachallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindUniqueCharactersUsingHashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="lead automation engineer";
		
		Map<Character,Integer> hmap=new HashMap<Character,Integer>();
		
		for (char c : str.toCharArray()) {
			hmap.put(c, hmap.getOrDefault(c, 0)+1);
		}
		
		for (Entry<Character, Integer> eachEntry : hmap.entrySet()) {
			
			if(eachEntry.getValue()==1) {
				System.out.println(eachEntry.getKey());
			}

		}
		
	}
	
	/*
	 * The expression hmap.getOrDefault(c, 0) returns the current count of the
	 * character c in the map (or 0 if c is not yet in the map). 
	 * Adding 1 to this value increments the count of the character c.
	 * 
	 * Initial State: Input String: "lead" hmap: {} (empty map) Iteration 1: c = 'l'
	 * hmap.getOrDefault('l', 0) returns 0 (since 'l' is not yet in the map) 0 + 1 = 1 
	 * hmap.put('l', 1) updates the map to {'l': 1} Iteration 2: c = 'e'
	 * 
	 * hmap.getOrDefault('e', 0) returns 0 (since 'e' is not yet in the map) 0 + 1 =1 
	 * hmap.put('e', 1) updates the map to {'l': 1, 'e': 1}
	 */
}
