package javachallenge;

public class AsciiToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte ascii[] = { 81, 70, 81 };
		String firstString = new String(ascii);
		System.out.println(firstString);

		String secondString = new String(ascii, 1, 2);
		System.out.println(secondString);

	}

}
