package com.oca.example;

public class GarbageCollection {

    /**
     * Akkor lesz egy objektum garbage collection által
     * törölhető ha az null lesz és egyetlen egy objektumnak sem referenciája
     * **/


    static char ch;
    public static void main(String[] args) {
        Object a = new Object();

        String A = new String("adasdasd");
        a = A;

        A = (String) a;

        //Csak innentől lesz garbage collector által törölhető
        a = null;

        System.out.println(ch);

        new Long("123");

        System.out.println(Math.round(-0.5));

        System.out.println(Math.round(0.5));


        //This will not compile because Boolean class does not have a no-args constructor.
        //new Boolean() == false;


    }


}
