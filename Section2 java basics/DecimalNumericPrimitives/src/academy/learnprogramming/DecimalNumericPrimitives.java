package academy.learnprogramming;

public class DecimalNumericPrimitives {
    public static void main(String[] args) {

        //A floatnál meg kell adni az f betűt mivel alapból doublenek veszi
        float myNumber = 25.4f;

        //does not compile nem lehet a vonal a decimal. előtt
        //double before 10_.25;

        //does not compile nem lehet a vonal a decimal. után
        //double after = 10._25;

        // does note compile a vonal nem lehet elől
        //double first = _10.25;

        // does note compile a vonal nem lehet utolsó helyen
        //double last = 10.25_;

        double myDouble = 2.54;
        double myDouble2 = 2.54f;

        double anotherDouble = 2.45D; //d can be used for double it is optinal

        //Az E betű határozza meg hogy hány tizedes hellyel arrébb kerüljön
        //a .
        double scientific = 5.000123E03;
        double scientific2 = 5.000123E3;
        System.out.println("scientific: "+scientific);
        System.out.println("scientific2: "+scientific2);

        //ez a szám ugyanaz mint a scientific double
        double myDouble3 =  5000.125;
        System.out.println("scientific same: "+myDouble3);

        //p indicates hexadecimal floating point number
        double hexPi = 0x1.91eb851eb852fp1;

        System.out.println(hexPi);
    }

}
