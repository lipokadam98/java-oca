package academy.learnprogramming;

public class WholeNumericPrimitives {

    public static void main(String[] args) {
        //A számokat elválasztással is meg lehet adni
        long max = 123_2213123_123L;
        long n = 2_300L;

        int asd = 12_2;

        //octal numbers are (0-7)
        //javaban mindig 0 val kezdődnek az octal számok
        int oct = 07;


        //az átváltás 123 = (1 × 8²) + (2 × 8¹) + (3 × 8⁰) = 83
        int firstOct = 0123; //83 decimal
        System.out.println(firstOct);
        int secondOct = 022; //18 decimal

        //két octal number összege intben tárolva int lesz de ki tudjuk iratni az
        //octal összeget is
        int sumOct = firstOct + secondOct; //101 decimal 145 octal
        System.out.println("fisrt= "+firstOct + " second= "+secondOct);
        System.out.println("decimal sum = " + sumOct + " octSum= "+Integer.toOctalString(sumOct));

        //hexadecimal (0-9 and A-F)
        //0x-el kezdődik a szám
        int firstHex = 0xFE; //15 decimal
        int secondHex = 0x1E; //15 decimal
        int sumHex = firstHex + secondHex;
        System.out.println("first= "+firstHex + " second= "+secondHex);
        System.out.println("decimal sum = " + sumHex + " hectalSum= "+Integer.toHexString(sumHex));

        //binary 0b vel kezdődik
        //A vizsgára nem kell tudni az átváltásokat csak azt hogy milyen értéket vehetnek fel
        int firstBin = 0b1001; //9 decimal
        int secondBin = 0b0111; //7 decimal

        int sumBin = firstBin + secondBin;

        //ez incorrect
        //int thirdBin = 0b1111012;
        System.out.println("first= "+ firstBin + " second= "+ secondBin);
        System.out.println("decimalSum= "+sumBin + " binSum= " +Integer.toBinaryString(sumBin));
    }
}
