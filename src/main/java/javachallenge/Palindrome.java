package javachallenge;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "A man, a plan, a canal: Panama";
		String rev = "";
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		s1 = s1.toLowerCase();
		// System.out.println(s1);

		for (int i = s1.length() - 1; i >= 0; i--) {
			
			rev = rev + s1.charAt(i);

		}
		
		System.out.println(rev);
	}

}
