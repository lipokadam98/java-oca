package academy.learnprogramming;

/**
 * @author goran on 30/06/2017.
 */


import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class NumericPromotion {

    public static void main(String[] args) {
        // promotion is converting "smaller" to "bigger" type
        //Kisebb típussal rendelkező változók átconvertálódnak a a nagyobb típusúba
        //byte -> short -> int -> long -> float -> double
        //byte,short,char mindig int típusúak lesznek ha binary arithmetic operator van használva,
        //még akkor is ha nem szerepel int változó benne vagyis csak a fentebb említett 3 található meg
        int x = 5;
        double y = 10.55;
//        System.out.println("x + y = " + x + y );
//        double result = x + y;
        byte b = 10;
        int c = 5;
        double d = 4.5;

        double result = b + c + d;

        System.out.println("result= " + result);

        // casting is converting "bigger" type to "smaller" type

        double myDouble = 5.55;
        int myInt = (int) (4 + myDouble);
        System.out.println("result= " + myInt);

        int anotherInt = 125;
        byte myByte = 15;

        int intResult = anotherInt + myByte;
        byte byteResult = (byte)(anotherInt + myByte);

        System.out.println("intResult= " + intResult);
        System.out.println("byteResult= " + byteResult); // overflow
    }
}
