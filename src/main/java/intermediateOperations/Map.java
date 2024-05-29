package intermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Applies a function to every element in a stream, producing a new stream
		List<Integer> numbers=Arrays.asList(1,2,3,4,5);
		List<Integer> squaredNumbers=numbers.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println(squaredNumbers);
	}

}
