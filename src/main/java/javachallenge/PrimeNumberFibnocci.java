package javachallenge;

public class PrimeNumberFibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100; 
		int firstnum=0; int secnum=1, sum;
		for(int i=2; i<=n;i++) {
			System.out.println(firstnum);
			sum=firstnum+secnum;
			firstnum=secnum;
			secnum=sum;
		}
	}

}
