package javachallenge;

public class ReplaceWordSpecialCharactersIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "tomorrow";
	        StringBuilder sb = new StringBuilder();

	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (c == 'o') {
	                if (i == 1) {
	                    sb.append('$');
	                } else if (i == 3) {
	                    sb.append("$$");
	                } else if (i == 6) {
	                    sb.append("$$$");
	                }
	            } else {
	                sb.append(c);
	            }
	        }

	        String output = sb.toString();
	        System.out.println(output);
	}

}
