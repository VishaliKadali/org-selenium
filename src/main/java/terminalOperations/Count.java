package terminalOperations;

import java.util.Arrays;
import java.util.List;

public class Count {
	
	//Returns the count of elements in a stream

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("Supraja","Gouthami","Manu");
		long count=names.stream().count();
		System.out.println(count);
	}

}
