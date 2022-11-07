package com.oca.example;


import another.package2.*;

public class Primitives {

    public static void main(String[] args) {

        int integer = 1010;
        //byte értéke -128 és 127 között lehet
        byte bytevalue = (byte) 127;

        //két
        short shorValue = (short) (100 + bytevalue);

        char charValue = (char) 200000.0;

        int charToInt = charValue + shorValue + bytevalue;

        bytevalue = (byte) charValue;

        AnotherClass anotherClass;


        charValue = (char) bytevalue;

        charToInt = bytevalue;

        charToInt = shorValue;

        charToInt = charValue;

        int asd = 'a' + 'a';

        asd = charValue;
        charValue = (char) asd;

        charValue = (char) charToInt;

        //int + int, short + short, char + char, byte + byte,
        float floatVal = 10;
        double doubleValue = asd;
        doubleValue = charValue;

        doubleValue = bytevalue;
        doubleValue = floatVal;

        floatVal = (float) doubleValue;
    }
}
