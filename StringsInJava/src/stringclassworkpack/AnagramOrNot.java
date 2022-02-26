package stringclassworkpack;
import java.util.Arrays;

public class AnagramOrNot {

    /* Function to check whether two strings
       are anagram of each other */
    static boolean areAnagram(char[] str1,char[] str2) {
        // Get lengths of both strings
        int n1 = str1.length;
        int n2 = str2.length;
 
        // If length of both strings is not
        // same, then they cannot be anagram
        if (n1 != n2)
            return false;
 
        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);
 
        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;
        
        return true;
    }
 
    public static void main(String args[])
    {
        char str1[] = { 'l', 'i', 's', 't','e','n' };
        char str2[] = { 's', 'i', 'l', 'e','n','t','o' };
       
       
        if (areAnagram(str1, str2))
            System.out.println( "The two strings are anagram of each other");
        else
            System.out.println(
            "The two strings are not anagram of each other");
    }
}
