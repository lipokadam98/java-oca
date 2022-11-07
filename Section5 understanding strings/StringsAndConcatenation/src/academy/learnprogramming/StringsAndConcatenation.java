package academy.learnprogramming;

public class StringsAndConcatenation {
    public static void main(String[] args) {
        String text = "hello";
        String anotherText = new String("hello");
        System.out.println(2 + 3);//
        System.out.println("a" + "b");//ab
        System.out.println(1+2+"d");//3d

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);//64

        int elsoszam = 10;
        int masodikszam = 20;

        //Nagyon kell figyelni a string összefűzésre mivel sokat számít a zárójel
        //ha nincs kirakva akkor 1020 lesz mivel itt a string hamarabb van mint a fenti példában ezért a stringhez adódik hozzá a szám
        System.out.println("eredmény= "+ (elsoszam + masodikszam));

        String str = "";

        for(int i = 0; i < 10; i++){
            str += i +" ";
        }

        String hello = "hello";
        String world = "world";

        System.out.println(hello);
        //hello + world; doesnt compile
        System.out.println(str);
    }
}
