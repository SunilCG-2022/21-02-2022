/*1. Take an array of 10 elements. Split it into middle and store the elements in two dfferent arrays. E.g.-
INITIAL array :
58	24	13	15	63	9	8	81	1	78

After spliting :
58	24	13	15	63
9	8	81	1	78                                             */

package arrayexercises;
import java.util.*;


public class SplitOneArray {
 
    // this method accepts a array and prints the value
    static void pprint(int arr[])
    {
        for (int var : arr) {
            System.out.print(var + " ");
        }
 
        System.out.println();
    }
 
    public static void main(String args[])
    {
        int a[] = { 58,24,13,15,63,9,8,81,1,78 };       
        int n = a.length;
 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter position to split.");
 
        int pos = scanner.nextInt();       
        if (pos > 0 && pos < n) {
          
            int b[] = new int[pos];
            int c[] = new int[n - pos];
            
            for (int i = 0; i < pos; i++) {
                b[i] = a[i];
            }
            
            for (int i = 0; i < n - pos; i++) {
                c[i] = a[i + pos];
            }
 
            pprint(b);
            pprint(c);
        }
        else {
            System.out.println("Invalid position.");
         }
    }
}