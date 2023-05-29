package javachallenge;

public class PrimeNumbersFibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100, firstnum = 0, secnum = 1, sum;

		for (int i = 2; i <= n; i++) {

			System.out.println(firstnum);

			sum = firstnum + secnum;
			firstnum = secnum;
			secnum = sum;
			
		}
	}

}
