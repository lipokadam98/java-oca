package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

/**
 * @author goran on 11/07/2017.
 */
public class UsingWrappersInList {

    public static void main(String[] args) {
//        List<double> doubleList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();

        doubleList.add(10.5); // autoboxing
        doubleList.add(new Double(55.10));
        doubleList.remove(55.10); // autoboxing
        double first = doubleList.get(0); // unboxing to primitive

        System.out.println(doubleList);
        System.out.println(first);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(null);

        System.out.println(numbers);
        /*
        Arraylist autoboxing and boxing
        Automatikusan megtörténik illetve az is fontos hogy mivel nem primitívekkel dolgozik ezért az értékük lehet null így a vissza alakításnál null pointer exceptiont kaphatunk ha primitívben akarjuk tárolni azt az elemet ami esetleg null lehet.
        A removenál figyelni kell ha egy számokat tartalmazó arrayben van mondjuk 1 illetve 2 ha a removeban csak azt adom meg hogy remove(1)
        Akkor csak az 1 fog megmaradni viszont ha azt adnám meg hogy arraylist.remove(new Integer(1)); akkor viszont a kettő maradna meg. Mivel az első törlés index a második viszont már object alapú.

         */
//        int number = numbers.get(0); // null pointer excetion int cant hold/be null


        List<Integer> nums = new ArrayList<>();
        nums.add(1); // index 0
        nums.add(2); // index 1

        nums.remove(1);
//        nums.remove(new Integer(1));

        System.out.println(nums); // 1
    }
}
