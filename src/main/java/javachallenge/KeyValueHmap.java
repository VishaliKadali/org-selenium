package javachallenge;

import java.util.HashMap;
import java.util.Map;

public class KeyValueHmap {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="Vishali@1344";
		
		Map<Integer, Character> hmap=new HashMap<Integer, Character>();
		
		for(int i=0;i<str.length();i++) {
			hmap.put(i,str.charAt(i));
		}
		
		System.out.println(hmap);
	}
	
	

}
