package intermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Removes duplicates from the stream
		List<Integer> numbers=Arrays.asList(1,2, 5, 2, 5, 6, 9, 7, 10, 11, 1);
		List<Integer> distinctNumbers=numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctNumbers);
	}

}
