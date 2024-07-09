package javachallenge;

import java.util.ArrayList;
import java.util.List;

public class ReplaceUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			List<Integer> list=new ArrayList<Integer>();
			for(int i=1;i<=100;i++) {
				
				if(i%3==0 && i%2==0) {
					System.out.println("Selenium");
				}
				
				else if(i%3==0) {
					System.out.println("testng");
				}
				
				else if(i%2==0) {
					System.out.println("java");
				}
				
				else {
					list.add(i);
					System.out.println(i);
				}
			}
	}

}
