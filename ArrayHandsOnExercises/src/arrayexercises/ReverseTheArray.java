package arrayexercises;

public class ReverseTheArray {
/*Write a program to print array elements in the reverse order using swapping method?
Hint: take even number array
input: 20 30 40 50 60 70
output: 70 60 50 40 30 20   */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int [] arr = new int [] {20,30,40,50,60,70};  
	        System.out.println("Original array: ");  
	        for (int i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + " ");  
	        }  
	        System.out.println();  
	        System.out.println("Array in reverse order: "); 
	        for (int i = arr.length-1; i >= 0; i--) {  
	            System.out.print(arr[i] + " ");  
	        }  
	}

}
