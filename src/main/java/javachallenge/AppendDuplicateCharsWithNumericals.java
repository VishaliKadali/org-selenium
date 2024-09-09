package javachallenge;

public class AppendDuplicateCharsWithNumericals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String name = "aaabbccdaa";
	        StringBuilder result = new StringBuilder();
	        int count = 1;

	        for (int i = 0; i < name.length(); i++) {
	            if (i + 1 < name.length() && name.charAt(i) == name.charAt(i + 1)) {
	                count++;
	            } else {
	                result.append(name.charAt(i)).append(count);
	                count = 1;
	            }
	        }

	        System.out.println(result.toString());
	}

}