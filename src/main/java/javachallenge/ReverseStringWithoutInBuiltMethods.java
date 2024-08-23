package javachallenge;

public class ReverseStringWithoutInBuiltMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="vishalikadali";
		String reversed="";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			String currentChar=name.substring(i, i+1);
			
			if(currentChar.contains("i")) {
				reversed+="-";
			}
			else {
                reversed += currentChar;
            }
		}
		
		System.out.println("Reversed the string with string replaced by hyphen: " +reversed);
	}

}
