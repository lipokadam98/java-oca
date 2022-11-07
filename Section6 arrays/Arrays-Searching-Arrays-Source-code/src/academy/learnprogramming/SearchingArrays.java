package academy.learnprogramming;

import java.util.Arrays;

/**
 * @author goran on 9/07/2017.
 */
public class SearchingArrays {

    public static void main(String[] args) {

        /*
        Array search binary search
        A binary search hogy működni tudjon ahhoz elsőnek az elemeknek
         növekvő sorrendben kell lenniük más esetben kiszámíthatatlan
         működés lesz vagyis nem találja meg azt az elemet amit éppen
         szeretnénk hiába benne van.

        Ha az array sorted (Arrays.sort(array);)
        És akkor ad vissza minusz előjelű számot akkor az az elem
        nincs benne és a - jel után azt a számot adja ahol lennie kéne annak az elemnek

        Ha pedig sorted és van találat akkor az indexet adja vissza ahol az elem található a tömbben.
         */

        int[] numbers = {1, 3, 5, 6, 7};

        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 5));
        System.out.println(Arrays.binarySearch(numbers, 7));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 6));
        System.out.println(Arrays.binarySearch(numbers, 4));

        int[] notSortedNumbers = {5, 4, 10, 8, 6};
//        Arrays.sort(notSortedNumbers);

        System.out.println(Arrays.toString(notSortedNumbers));
        System.out.println(Arrays.binarySearch(notSortedNumbers, 5));
        System.out.println(Arrays.binarySearch(notSortedNumbers, 8));
    }
}
