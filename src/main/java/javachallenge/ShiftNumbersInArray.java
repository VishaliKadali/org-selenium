package javachallenge;

public class ShiftNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr= {1,2,3,0,20,0,2};
//		int lastElement=arr[arr.length-1];
//		
//		//Shift elements to the right
//		for(int i=arr.length-2; i>3; i--) {
//			
//			if(arr[i]==0) {
//				arr[i]=arr[i-1];
//				
//			}
//			arr[4]=lastElement;
//		}
//		
//		//print the modified array
//		for (int i : arr) {
//			System.out.println(i + "");
		
		
int[] arr = {1, 2, 3, 0, 20, 0, 2};
        
        int n = arr.length;
        int index = 0; // To track the position of non-zero elements
        
        // Traverse the array and move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        
        // Fill the remaining positions with zeros
        while (index < n) {
            arr[index++] = 0;
        }
        
        // Print the resulting array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
		}
	}

}
