/*write a Java program to remove an element by taking an index from the user?  */

package arrayexercises;

import java.util.Arrays;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int[] arr = new int[]{1,2,3,4,5};
	        int[] arr_new = new int[arr.length-1];
	        int j=4;   //the index you want to remove
	        for(int i=0, k=0;i<arr.length;i++){
	            if(i!=j){
	                arr_new[k]=arr[i];
	                k++;
	            }
	        }
	        System.out.println("Before deletion :" + Arrays.toString(arr));
	        System.out.println("After deletion :" + Arrays.toString(arr_new));
	}

}
