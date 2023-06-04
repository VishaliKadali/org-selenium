package javachallenge;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray= {2,5,7,9,7,2,1,5,1,4,7,};
		Map<Integer,Integer> hmap=new HashMap<Integer, Integer>();
		for(int i=0;i<=inputArray.length-1;i++) {
			if(hmap.containsKey(inputArray[i])) {
				int count=hmap.get(inputArray[i])+1;
				hmap.put(inputArray[i], count);
			}
			
			else {
				hmap.put(inputArray[i], 1);
			}
		}
		System.out.println("Duplicate elements are ");
		for(Map.Entry<Integer, Integer>entry: hmap.entrySet()) {
			if(entry.getValue()>1) {
				
				System.out.println( +entry.getKey());
			}
		}
	}

}
