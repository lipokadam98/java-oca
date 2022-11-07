package academy.learnprogramming;

import java.util.Arrays;

/**
 * @author goran on 9/07/2017.
 */
public class SortingArrays {

    public static void main(String[] args) {
        int[] numbers = {5, 10, 2};

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        System.out.println(numbers);


        System.out.println(Arrays.toString(numbers));

        String[] strings = {"50", "9", "500"};
        Arrays.sort(strings);
        //String arraynél vigyázni kell mivel abc sorrendet néz
        System.out.println(Arrays.toString(strings));
    }
}
