package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author goran on 11/07/2017.
 */
public class SearchingList {

    public static void main(String[] args) {
        //A binary search szabályai amelyek igazak az arrayben való keresésre azok igazak
        //a listben való keresésre is
        List<String> numsList = new ArrayList<>();
        numsList.add("500");
        numsList.add("10");
        numsList.add("9");
        numsList.add("50");
        numsList.add("40");

        System.out.println(numsList);

        int index = Collections.binarySearch(numsList, "10");
        System.out.println(index);

        Collections.sort(numsList);
        System.out.println(numsList);
        index = Collections.binarySearch(numsList, "10");
        System.out.println(index);

        List<Integer> numbers = Arrays.asList(5, 4, 8, 10, 11, 7, 3);
        System.out.println(numbers);

        index = Collections.binarySearch(numbers, 7);
        System.out.println(index);

        Collections.sort(numbers);
        System.out.println(numbers);

        index = Collections.binarySearch(numbers, 7);
        System.out.println(index);

        //VIZSGÁN HA BINARY SEARCH VAN A SORT NAGYON FONTOS ELSŐNEK
    }
}
