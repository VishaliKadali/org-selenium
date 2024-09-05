package javachallenge;

public class ThirdLargestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int[] a = {-10, 34, -56, 11, 89, 43, -9};
		
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>first) {
				
				third=second;
				second=first;
				first=a[i];
			}
			
			else if (a[i] > second && a[i] != first) {
                third = second;
                second = a[i];
            } else if (a[i] > third && a[i] != second && a[i] != first) {
                third = a[i];
            }
		}
		
		 if (third == Integer.MIN_VALUE) {
	            System.out.println("Array doesn't have a third distinct largest element");
	        } else {
	            System.out.println("The third largest element is: " + third);
	        }
	}

}
