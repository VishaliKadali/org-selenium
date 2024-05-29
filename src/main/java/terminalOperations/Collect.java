package terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {

	
	//Collects the elements of a stream into a collection
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=Arrays.asList("Subratha", "Dilip", "Meghan");
		
		List<String> collectedNames=names.stream().collect(Collectors.toList());
		
		System.out.println(collectedNames);
	}

}
