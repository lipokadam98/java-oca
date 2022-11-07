package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author goran on 11/07/2017.
 */
public class ListArrayConversion {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tony");
        names.add("Jimmy");
        names.add("Anthony");

        Object[] namesArray = names.toArray();
        System.out.println(namesArray.length);

        //Ez egy jobb megoldás arra hogy arrayListet vagy ebben az esetben listet String-é alakítsunk
        //hiszen meg tudjuk adni a típusát is és ha megadjuk hogy new String[0]
        //akkor még a méretét is dinamikusan megnöveli majd annak megfeleően ahány elemre van szüksége
        String[] stringArray = names.toArray(new String[0]);
        //A jobb módszer ha megadjuk a names array a méretét
        String[] anotherStringArray = names.toArray(new String[names.size()]);

        //anonymus arraynek hívják ha {} között adjuk meg a dolgokat
        String[] petsArray = {"dog", "cat", "parrot"};
        /*String[] anotherArray = new String[]{"asdsadasd","12321312"};
        String anotherArray2[] = new String[5];
        String[] anotherArray3[] = {{"asdasdsa","asdasd","3123123","213123123","213123123"},{"wsweqwe","21312321"}};
        System.out.println(anotherArray3[0].length);*/

        //Így is meg lehet adni az elemeket
         List<String> petsListBeiros = Arrays.asList("dog", "cat", "parrot");
        List<String> petsList = Arrays.asList(petsArray); // returns fixed size list
        //mivel ez egy fix méretű list lesz ezért nem lehet hozzá adni elemet illetve törölni sem
        //System.out.println(petsList.add("asdasd"));

        System.out.println(petsList.size());

        petsList.set(0, "bird");
        System.out.println(petsList);
        System.out.println(Arrays.toString(petsArray));

        petsArray[0] = "husky";
        System.out.println(petsList);
        System.out.println(Arrays.toString(petsArray));

        //konklúzió
        //Ha arrayt alakítok listté akkor fix méretű listet kapok
        //ha módosítok az arrayben vagy a Listben mind a kettő hat a másikra
        //DE csak akkor ha arrayt alakítok listté
        //ha listet alakítok arrayé akkor ez az oda vissza hatás nincsen meg

//        petsList.add("newDog");
//        petsList.remove(1);

        List<String> list = Arrays.asList("one", "two", "three");
        System.out.println(list);
//        list.add("four");
    }
}
