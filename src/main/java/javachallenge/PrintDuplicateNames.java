package javachallenge;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"QA", "Dev", "Operations", "Technical", "QA" ,"Dev"};
		
		Set<String> set=new HashSet<String>();
		System.out.println("Duplicate names are: " );
		for (String eachName : names) {
			if(set.add(eachName)==false) {
				System.out.println(eachName);
			}
		} 
	}

}
