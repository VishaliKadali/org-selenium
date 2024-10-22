package javachallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccuranceOfCompleteString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "we learn java basics as part of java sessions in java week1";
		String[] words=text.split("\\s");
		
		HashMap<String,Integer> hmap=new HashMap<String,Integer>();
		
		for (String eachWord : words) {
			if(hmap.containsKey(eachWord)) {
				int count=hmap.get(eachWord)+1;
				hmap.put(eachWord, count);
			}
			else {
				hmap.put(eachWord, 1);
			}
		}
		
		for (Map.Entry<String, Integer> eachEntry : hmap.entrySet()) {
			if(eachEntry.getValue()>1) {
				System.out.println("Word " +eachEntry.getKey()+ " is present : " +eachEntry.getValue()+ " times");
			}
		}
	}

}
