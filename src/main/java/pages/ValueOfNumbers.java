package pages;

public class ValueOfNumbers {


    public static int numberOfValues (int[] arr) {

        int s = 0;// variable to count the number of elements

        for (int i = 0; i < arr.length; i++) // search for values inside an array
            if ((arr[i] % 4 == 0)||(arr[i] % 6 == 0)) // check the remainder of a division when divided by 4 or 6
            {
                s++ ;
            }
            return s;
    }
}
