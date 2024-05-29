package terminalOperations;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	
	//ForEach : Performs an action for each element in a stream
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names=Arrays.asList("vidya","Aravind","Subraja");
		names.stream().forEach(name->System.out.println(name));
	}

}
