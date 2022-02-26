/*Write  a Java Program to count number of duplicated values in
b) char array (create the char array in lower case)       */

package arrayexercises;

import java.util.Arrays;

public class CountCharElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] values = { 'a','d','f','s','d','a','e','f' };
        duplicate(values);
    }

    public static void duplicate(char[] values) {
        Arrays.sort(values);
        int previous = values[0] - 1;
        
        int dupCount = 0;

        for (int i = 0; i < values.length; ++i) {
            if (values[i] == previous) {
                ++dupCount;
            } else {
                previous = values[i];
            }
        }
        System.out.println("There were " + dupCount + " duplicates in the array.");
	}

}
