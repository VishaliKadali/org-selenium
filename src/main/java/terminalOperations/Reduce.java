package terminalOperations;

import java.util.Arrays;
import java.util.List;

public class Reduce {

	
	//Combines the elements of a stream into a single list
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(1,2,3,4,5);
		int sum = numbers.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
	}

}
