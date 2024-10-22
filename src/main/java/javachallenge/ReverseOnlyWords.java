package javachallenge;

public class ReverseOnlyWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="java programming is not boring";
		
		String words[]=str.split(" ");
		
		String result="";
		for(int i=words.length-1;i>=0;i--) {
			result += words[i]+" ";
		}
	
	 System.out.println(result);
}
	
}
