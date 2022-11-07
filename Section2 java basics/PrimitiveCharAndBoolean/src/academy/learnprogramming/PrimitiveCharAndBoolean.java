package academy.learnprogramming;

import static java.lang.Boolean.TRUE;
public class PrimitiveCharAndBoolean {

    public static void main(String[] args) {

        boolean asd = TRUE;

        char ch = 'a';

        //túl sok karakter does not compile
        //char ch1 = 'ab';

        char ch1 = '1';
        //unicode megadás is lehetséges char esetén
        char uniChar = '\u03A9'; //upper case greek omega character

        char romanNumber = '\u216C';// roman 50 number

        System.out.println("ch1= "+ch1);
        System.out.println("uniChar= "+uniChar);
        System.out.println("romanNumber= "+romanNumber);

        boolean myBoolean = true;

        boolean myFalseBoolean = false;

        System.out.println("myBoolean= "+myBoolean);
        System.out.println("myFalseBoolean= "+myFalseBoolean);

        //a true nevet nem lehet megadni
        //boolean true = false;
    }
}
