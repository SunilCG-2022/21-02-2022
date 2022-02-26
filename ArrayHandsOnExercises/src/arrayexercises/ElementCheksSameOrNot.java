//3. Write a program to check if elements of an array are same or not it read from front or back.

package arrayexercises;
 
public class ElementCheksSameOrNot {
public static boolean areSame(Integer arr[])
    {
       Integer first = arr[0];
       for (int i=1; i<arr.length; i++)
           if (arr[i] != first)
                return false;
       return true;
    }
 
public static void main(String[] args)
    {
        Integer[] arr = { 1, 1, 1, 1, 1};
        if (areSame(arr))
            System.out.println("All Elements are Same");
        else
            System.out.println("Not all Elements are Same");
    }
}