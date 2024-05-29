package terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Flattens nested stream into a single stream
		List<List<String>> listOfLists=Arrays.asList(Arrays.asList("Testng","Cucumber"),
												Arrays.asList("Java","Selenium"),
												Arrays.asList("Git","Jenkins"));
		
		List<String> flatList=listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
		
		System.out.println(flatList);
	}
	
	

}
