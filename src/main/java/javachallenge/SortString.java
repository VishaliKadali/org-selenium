package javachallenge;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="vishali";
		char[] tocharArray=str.toCharArray();
		for(int i=0;i<=tocharArray.length;i++) {
			char temp;
			for(int j=i+1;j<tocharArray.length;j++) {
				if(tocharArray[i]>tocharArray[j]) {
					temp=tocharArray[i];
					tocharArray[i]=tocharArray[j];
					tocharArray[j]=temp;
				}
			}
			
		}
		
		System.out.println(tocharArray);
	}

}
