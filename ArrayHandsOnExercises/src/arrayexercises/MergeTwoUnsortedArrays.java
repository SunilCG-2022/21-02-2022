//Write a Java program to merge two unsorted arrays of differnt lengths?
package arrayexercises;

public class MergeTwoUnsortedArrays { 

    public static void main(String[] args)
    {
 
        int a[] = { 3,7,4,8 };
        int b[] = { 11,4,7,23,13,9,0 };
 
        int alength = a.length;
        int blength = b.length;
        int resultlength = alength + blength;
  
        int[] result = new int[resultlength];
        
        for (int i = 0; i < alength; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < blength; i++) {
            result[alength + i] = b[i];
        }
        for (int i = 0; i < resultlength; i++) {
            System.out.println(result[i]);
        }
    }
}
