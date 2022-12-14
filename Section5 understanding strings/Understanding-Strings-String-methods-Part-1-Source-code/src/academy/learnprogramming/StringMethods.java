package academy.learnprogramming;

/**
 * @author goran on 6/07/2017.
 */
public class StringMethods {

    public static void main(String[] args) {
        // 0 1 2 3 4 5 6 7 8 9 10
        // j a v a   i s   f u n
        String str = "java is fun";

        // length
        System.out.println("length= " + str.length());

        // char at
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(10));

        // index of
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('a', 2));
        System.out.println(str.indexOf("fun"));
        System.out.println(str.indexOf("fun", 10)); // - match not found

        // substring
//        str = str.substring(8);
        //Ha a substring számára csak 1 szám van megadva akkor az adott karaktertől kezdve adja vissza
        //a stringet
        // 0 1 2 3 4 5 6 7 8 9 10
        // j a v a   i s   f u n
        //substring 8 az a java lesz
        System.out.println("Substring 8: "+str.substring(8));
        //Az 5-ös index már nem tartozik bele csak az adott számig megy
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(4, 4)); // empty string
        System.out.println(str.substring(4, 4)); // empty string

//        System.out.println(str.substring(4, 2)); // out of range
//        System.out.println(str.substring(8, 14)); // out of range

        System.out.println("AbCd".toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str);

        String dog = "Lucky";
//        dog.toUpperCase();
        dog = dog.toUpperCase();
        System.out.println(dog);
    }
}
