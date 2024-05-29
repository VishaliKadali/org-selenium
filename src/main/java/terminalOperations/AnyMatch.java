package terminalOperations;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Checks if any element in the stream matches a condition
		
		List<String> names=Arrays.asList("Aravind", "Ragu", "Gokul");
		boolean anyMatch=names.stream().anyMatch(name->name.startsWith("A"));
		System.out.println(anyMatch);
	}

}
