package javachallenge;

import java.util.HashMap;

public class UniqueCharactersWithoutCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I know automation selenium and restassrued";
		
		HashMap<Character, Integer> hmap=new HashMap<Character, Integer>();
		
		for(int i=str.length()-1;i>=0;i--) {
			if(hmap.containsKey(str.charAt(i))) {
				int count= hmap.get(str.charAt(i));
				hmap.put(str.charAt(i), ++count);
				
			}
		
			
			else {
				hmap.put(str.charAt(i), 1);
			}
			
		}
		
		//System.out.println(hmap);
		
		//Convert the string into toCharArray 
		//Get eachCharacter from hmap
		//if hmap has morethan 1 character print the character
		
		for (char c : str.toCharArray()) {
			if(hmap.get(c)>1) {
				System.out.println(c);
			}
			else {
				if(hmap.get(c)==1) {
					System.out.println("Unique elements "+c);
				}
			}
		}
	}

}
