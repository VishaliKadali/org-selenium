package javachallenge;

public class Fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100, firstnum = 0, secnum = 1, sum;
		System.out.println(firstnum);
		for (int i = 2; i <n; i++) {

			

			sum = firstnum + secnum;
			firstnum = secnum;
			secnum = sum;
			System.out.println(sum);
			
			
		}
		
	}
		
	
}
