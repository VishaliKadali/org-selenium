package javachallenge;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Welcome back to India";
		String[] words=str.split(" ");
		StringBuilder reversedString=new StringBuilder();
		
		for(int i=0;i<words.length;i++) {
			
			String word=words[i];
			StringBuilder reverseWord=new StringBuilder();
			
			for(int j=word.length()-1;j>=0;j--) {
				reverseWord.append(word.charAt(j));
			}
			
			reversedString.append(reverseWord);
			if(i!=words.length-1) {
				reversedString.append(" ");
			}
		}
		
		System.out.println(reversedString.toString().toLowerCase());
		
	}

}
