package academy.learnprogramming;

import static java.lang.Math.*;
import static java.lang.System.out;
import static academy.learnprogramming.Config.*;
public class StaticImportExample {

    public static void main(String[] args) {
        //Ha pl a static Math osztályból szeretnénk dolgokat használni akkor
        //elég felül beimportálni és így nem kell mindig kiírni azt hogy
        //Math.PI például utána elég már csak a PI-t kiírni.
        //Static importok csak static member importra használhatóak
        //a regular import pedig classokra
        //You should use static methods whenever,
        //
        //The code in the method is not dependent on instance creation and is not using any instance variable.
        //A particular piece of code is to be shared by all the instance methods.
        //The definition of the method should not be changed or overridden.
        //you are writing utility classes which should not be changed.
        //Attól mert static egy változó típusa még megváltozhat az értéke
        //Egy valódi programban nem célra vezető túl sok static dolgot beimportálni
        //mivel utána nehezebben lehet kideríteni hogy egy adott metódus honnan is származik
        out.println("min= "+min(5,7));
        out.println(PI);

        printConfig();
    }
}
