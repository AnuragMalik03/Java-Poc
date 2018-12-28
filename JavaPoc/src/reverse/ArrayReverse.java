package reverse;

import java.util.Arrays;

public class ArrayReverse {

	
	public static void reverseArray(int[] arr2){
		
		
		
		
		
		
	}
	
		
		
		public static void main(String args[]) {
			
			int[] arr1 = {2,5,9,7,4,1,3,6};
			
			int len = (arr1.length-1)/2;
			
			//reverseArray(arr1);
			
			for(int i=0 ; i<len ; i++) {
				
				int	temp = arr1[i];
				arr1[i]=arr1[len];
				arr1[len] = temp;	
					}
			for(int i=0 ; i<arr1.length ; i++) {
			System.out.print(arr1[i] + " ");
			}
		}
	
	
}
