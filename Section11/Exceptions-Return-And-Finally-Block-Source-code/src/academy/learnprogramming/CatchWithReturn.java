package academy.learnprogramming;

/**
 * @author goran on 21/07/2017.
 */
public class CatchWithReturn {

    public static void main(String[] args) {
        System.out.println(calculate());

    }

    public static int calculate() {
        try {
            return 10 / 1;
        } catch (ArithmeticException e) {
            System.out.println("error");

            //A system exit felülvágja a finallyt is
            System.exit(0);
            return 1;
        } finally {
            //A finally akkor is le fog futni a return 1 előtt a catch ágban ha a finallyban nincs return
            System.out.println("finally");
            return 0;
        }
    }
}
