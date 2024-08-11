package javachallenge;

public class SeparateNumericalsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="abc12345456@#$";
		
		
		StringBuilder alphabets=new StringBuilder();
		StringBuilder numericals=new StringBuilder();
		 StringBuilder specialCharacters = new StringBuilder();
		
		for (char c : input.toCharArray()) {
			if(Character.isDigit(c)) {
				numericals.append(c);
			}
			else if (Character.isLetter(c)) {
				alphabets.append(c);
			}
			else {
				specialCharacters.append(c);
			}
		}
		
		// Print the results
        System.out.println(alphabets.toString() + " " + numericals.toString() + " " + specialCharacters.toString());
    
	}

}
