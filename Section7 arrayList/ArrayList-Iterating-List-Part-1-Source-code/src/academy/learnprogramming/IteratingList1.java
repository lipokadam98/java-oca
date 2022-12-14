package academy.learnprogramming;

import java.util.*;

/**
 * @author goran on 11/07/2017.
 */
public class IteratingList1 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        //for cikluson belül nem jó ötlet törölni
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("element at index " + i + " is " + numbers.get(i));
//            numbers.remove(2); // index out of bounds
        }

        for (Integer number : numbers) {
            System.out.println("number= " + number);
//            numbers.remove(2); // concurrent modification
        }

        //Iteratorral egyszerre tudunk végig menni és módosítani is ez nem lehetséges sima for és
        //for each segítségével
        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            System.out.println(number);
            iterator.remove();
            
        }

        System.out.println(numbers);

        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        //Listiterator csak listekkel használható
        //listiterator az egy more advanced iterator
        //Ha fordítva akarunk egy listen végig menni illetve egy adott indextől akkor a listiterator
        //jobb megoldás
        for(ListIterator<Integer> listIterator = numbers.listIterator(5); listIterator.hasPrevious(); ) {
            System.out.println(listIterator.previous());
            listIterator.remove();
        }

        System.out.println(numbers);
    }
}
