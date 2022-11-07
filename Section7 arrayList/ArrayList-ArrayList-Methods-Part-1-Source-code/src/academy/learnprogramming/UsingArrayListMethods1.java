package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

/**
 * @author goran on 11/07/2017.
 */
public class UsingArrayListMethods1 {

    public static void main(String[] args) {
//        List list = new ArrayList();
        List<Object> list = new ArrayList<>();
        list.add("dog");
        list.add(5);

        System.out.println(list);
        //ez egy comment
        List<String> pets = new ArrayList<>();
        pets.add("dog");
        System.out.println(pets);
//      az adott indexre rakja be az objectet és automatikusan eltolja a többit 
        pets.add(0, "cat");
        System.out.println(pets);

//        pets.add(5);
        // 0     1
        // cat, dog
        pets.add(1, "parrot"); // cat, parrot, dog
        pets.add(0, "husky"); // husky, cat, parrot, dog
        pets.add(1, "bird"); // husky, bird, cat, parrot, dog
        System.out.println(pets);

        // remove
        pets.remove("parrot");  // husky, bird, cat, dog
        System.out.println(pets);
// index alapján való törlés
        pets.remove(2); // husky, bird, dog
        System.out.println(pets);

//        pets[0] = "newBird";
//set az felül írja az indexen lévő elemet
        pets.set(0, "newBird"); // newBird, bird, dog
        System.out.println(pets);
//        pets.set(6, "myDog"); // index out of bounds
    }
}
