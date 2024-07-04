package javachallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * In Java, entrySet() and keySet() are methods provided by the Map interface,
		 * which is implemented by classes like HashMap, LinkedHashMap, and TreeMap.
		 */
		Map<String,Integer> map=new HashMap<String, Integer>();
		
		/*
		 * In this example, entrySet() is called on the map to get a set of entries.
		 * Then, a loop iterates over each entry, and getKey() and getValue() methods
		 * are used to access the key and value of each entry, respectively.
		 */
		map.put("Apple", 10);
		map.put("Orange", 20);
		map.put("Banana", 30);
		map.put("Apple", 40);
		
		//Step1: To get the below entry set type map.entrySet(); select and press ctrl 2 + l
		
		
	
		
		Set<Map.Entry<String,Integer>> entries=map.entrySet(); 
		for(Map.Entry<String,Integer> entry:entries) {
			String key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println(" Key: " +key+ ", Value: " +value);
		}
			
			/*
			 * keySet(): The keySet() method returns a Set of all the keys present in the
			 * map. This method is useful when you only need to operate on the keys of a map
			 * and do not require the associated values.
			 */
		
		
		//Step2: To write the for loop type forEach and press ctrl 2 + l and modify as per your requirements

		
			Set<String> keys = map.keySet();
			for (String key : keys) {
			    System.out.println("Key: " + key);
			}
			
	
			/*
			 * In this example, keySet() is called on the map to get a set of keys. Then, a
			 * loop iterates over each key, and the key is printed or used for further
			 * operations.
			 * 
			 * Both entrySet() and keySet() provide convenient ways to iterate over the
			 * elements of a map. The choice between them depends on whether you need to
			 * access both keys and values (entrySet()) or only the keys (keySet()) in your
			 * specific use case.
			 */

		}
		
	}

