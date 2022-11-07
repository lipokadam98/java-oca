package academy.learnprogramming;

/**
 * @author goran on 6/07/2017.
 */
public class StringMethods2 {

    public static void main(String[] args) {
        String str = "java";
        String str2 = "Java";
        String str3 = "ja";

        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        // startsWith / endsWith
        System.out.println(str.startsWith("j"));
        System.out.println(str.startsWith(str3));
        //Csakis a string literálra lehet többi metódust hívni
        //pl ami alatta van "J"-re
        System.out.println(str.startsWith("J".toLowerCase()));
        System.out.println(str.endsWith("va"));

        // contains
        System.out.println(str.contains(str3));
        System.out.println(str.contains("av"));
        System.out.println("Java".contains("j".toUpperCase()));

        // replace
        //a replace illetve a replaceall között az a különbség hogy a replaceall regexet is elfogad
        String myString = "Java" + " " + "is" + " " + "cool";

        //egy új string jön létre minden esetben a replace esetén is tehát ha nem írjuk felül a változót
        //akkor a replace nem fog hatni rá
        System.out.println(myString.replace('a', 'A'));
        System.out.println(myString.replaceAll(" ", "_"));
        System.out.println(myString.replace("is", "_"));
        System.out.println(myString);

        // trim
        System.out.println("Java".trim());
        System.out.println(" Java is cool  ");
        //A trim a kezdő illetve a vég spaceket vágja le
        System.out.println(" Java is cool  ".trim());
    }
}
