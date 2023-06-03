package javachallenge;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10, 5, 20, 32, 45};
		int[] b=new int[a.length];
		
		for(int i=0;i<=a.length-1;i++) {
			
			b[i]=a[i];
			
			System.out.println(b[i]);
		}
	}

}
