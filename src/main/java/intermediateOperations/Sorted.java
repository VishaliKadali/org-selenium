package intermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Sorts the elements of the stream
		List<String> names=Arrays.asList("Rajini", "Raghu","Vishali","Manu");
		List<String> sortedNames=names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNames);
	}

}
