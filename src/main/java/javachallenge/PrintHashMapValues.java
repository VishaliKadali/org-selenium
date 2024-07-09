package javachallenge;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class PrintHashMapValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			// TODO Auto-generated method stub
			HashMap<Integer,String> hmap=new HashMap<Integer, String>();
			hmap.put(1, "Vishali");
			hmap.put(2, "Aradhya");
			hmap.put(3,"Devansh");
			hmap.put(4,"Devansh");
			hmap.remove(3);
			//System.out.println(hmap);
		
			Set<Entry<Integer, String>> entrySet = hmap.entrySet();
			for (Entry<Integer, String> eachEntry : entrySet) {
				Integer Key=eachEntry.getKey();
				String value=eachEntry.getValue();
				System.out.println("Key is "+Key+ " Value is " +value);
			}
	}
	
	

}
