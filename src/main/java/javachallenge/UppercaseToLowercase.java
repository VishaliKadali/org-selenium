package javachallenge;

public class UppercaseToLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Test Automation engiNeer";
		StringBuilder result=new StringBuilder();
		
		//Iterate through each chraacter in a string
		for(int i=0; i< str.length();i++) {
			char ch=str.charAt(i);
			
			// Check if the character is uppercase
			if(Character.isUpperCase(ch)) {
				result.append(Character.toLowerCase(ch));
			}
			
			else if(Character.isLowerCase(ch)) {
				result.append(Character.toUpperCase(ch));
			}
			
			else {
				result.append(ch);
			}
		}
		
		 // Convert StringBuilder to String and print the result
        System.out.println(result.toString());
	}

}
