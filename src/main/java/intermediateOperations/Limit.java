package intermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Limit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Limits the number of elements in the stream
		List<Integer> numbers=Arrays.asList(1, 2, 3, 4,5);
		List<Integer> limitedNumbers=numbers.stream().limit(3).collect(Collectors.toList());
		System.out.println(limitedNumbers);
	}

}
