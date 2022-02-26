/*Write a Java Program to find sum of numbers 
a) even index
b) odd index               */
package arrayexercises;
public class SumOfOddAndEvenIndexesInArray {


public static void main(String[] args) {
        int[] array = {1, 1, 8, 4, 2, 6,8,9};
        sum(array);
        sum2(array);
}

   public static int sum(int[] y) {
      int sum = 0;
      int i = 0;
      while(i < y.length){
    	   if(i % 2 == 1){ 
    	      sum += y[i];
    	   }
    	   i++;
    	}
      System.out.println("Sum of all odd indexes:"+sum);
      return i;
   }
   
   public static int sum2(int[] y) {
	      int sum = 0;
	      int i = 0;
	      while(i < y.length){
	    	   if(i % 2 == 0){ 
	    	      sum += y[i];
	    	   }
	    	   i++;
	    	}
	      System.out.println("Sum of all even indexes:"+sum);
	      return i;
	   }
}