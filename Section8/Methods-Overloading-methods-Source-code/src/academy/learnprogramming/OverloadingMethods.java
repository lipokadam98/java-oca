package academy.learnprogramming;

/**
 * @author goran on 13/07/2017.
 */
public class OverloadingMethods {

    //jump(1,2);
    //overload sorrend
    //exact match by type
    //public void jump(int a,int b){}
    //Larger primitive type
    //public void jump(long a,long b){}
    //Autoboxing
    //public void jump(Integer a,Integer b){}
    //Variable arguments varargs
    //public void jump(int... numbers){}

    public void walk(int miles) {
    }

    void walk(short feet) {

    }

    public boolean walk() {
        return false;
    }

    void walk(int miles, short feet) {
    }

    public void walk(float miles) {
    }
//    public int walk(float km) {} // does not compile
//    public static void walk(float miles) {}

    public void walk(int[] lengths) {
    }
//    public void walk(int... vars) {}


    public static void run(int length) {
    }

    public static void run(Integer length) {
    }

    public static void run(double kilometers) {
    }

    public static void jump(String s) {
        System.out.println("string");
    }

    public static void jump(Object o) {
        System.out.println("object");
    }



    public static void main(String[] args) {
        run(9);
        jump("test");
        //mivel nincs olyan metódus ami intet fogad el ezért automatikusan az object paraméteres hívódik meg
        jump(25);

        sum(1, 2);
    }

//    public static int sum(int a, int b) {
//        System.out.println("int sum");
//        return a + b;
//    }

    //    public static long sum(long a, long b) {
//        System.out.println("long sum");
//        return a + b;
//    }
    public static int sum(int... numbers) {
        System.out.println("sum var args");

        int sum = 0;

        for (int i : numbers) {
            sum += i;
        }

        return sum;
    }

//    public static Integer sum(Integer a, Integer b) {
//        System.out.println("integer sum");
//        return a + b;
//    }


}
