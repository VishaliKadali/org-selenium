package javachallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("QA");
		list.add("SoftwareEngineer");
		list.add("QA");
		list.add("testing");
		list.add("testng");
		list.add("Selenium");
		list.add("Java");
		list.add("testng");
		list.add("logs");
		
		Set<String> set=new HashSet<String>();
		for (String name : list) {
			if(set.add(name)==false) {
				System.out.println(name+ " name is duplicated");
			}
		}
	}

}
