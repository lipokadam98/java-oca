package academy.learnprogramming;

public class AssignmentOperators {

    public static void main(String args[]){
        //int x = 1.0;
        //short y = 1234521312;
        //int z = 9f;
        //long t = 1234513213213213;


        int x = (int)1.0;
        //overflow amikor nem fér bele az adott data típusba a megadott szám
        short y = (short)1981234533.1;
        int z = (int)9f;
        long t = 1234513213213213L;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("t = " + t);

        //overflow and underflow with byte -128 to 127

        byte myByte = 127;
        byte mySecondByte = -128;

        System.out.println("myByte "+myByte);
        System.out.println("mySecondByte "+mySecondByte);

        //Ez nem működik mivel a kis adatokat tartalmazó típusokkal való műveletek során alapból int lesz a típus
        //és ezért a myByte értéke nem lehet int;
        //myByte = myByte + 1;
        myByte++;
        //mySecondByte = mySecondByte - 1;

        mySecondByte--;

        System.out.println("myByte "+myByte);
        System.out.println("mySecondByte "+mySecondByte);

        short a = 10;

        short b = 20;
        //Ez nem működik mivel a kis adatokat tartalmazó típusokkal való műveletek során alapból int lesz a típus
        short c = (short) (a * b);

        System.out.println("c = " + x);
    }
}
