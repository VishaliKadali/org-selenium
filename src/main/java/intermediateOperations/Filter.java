package intermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	// Extracts elements from a stream based on condition
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Aravind", "Vidya", "Supraja", "Rajini");

		// Use the Stream API to filter names that start with "V" and collect them into a new list.
		List<String> filteredNames = names.stream().filter(name -> name.startsWith("V")).collect(Collectors.toList());
		filteredNames.forEach(System.out::println);
		//filteredNames.forEach(name -> System.out.println(name));
	}

}
