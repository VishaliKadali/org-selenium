package terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Min {
	
	//Returns the min element in a stream
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers= Arrays.asList(1,2,3,4,5);
		Optional<Integer> min=numbers.stream().min(Integer::compareTo);
		System.out.println(min);
	}

}
