package javachallenge;

public class ReverseNameRemoveSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "123vishali";
		name = name.replaceAll("[^a-z]", "");
		char[] ch = name.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.println(ch[i]);
		}
	}

}
