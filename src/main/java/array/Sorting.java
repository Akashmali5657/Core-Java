package array;

import java.util.Arrays;
import java.util.Collections;
public class Sorting {
    public static void main(String[] args)
    {
        //defining an array of integer type
        int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
        //invoking sort() method of the Arrays class
        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: ");
        //prints array using the for loop
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }


        /*
        -
        -
        -Need to check this code
        -
        -
        */
        int [] array1 = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
//        Arrays.sort(array1, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " +Arrays.toString(array1));

    }
}
