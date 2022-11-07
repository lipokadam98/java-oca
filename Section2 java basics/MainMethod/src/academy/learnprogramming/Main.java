package academy.learnprogramming;
/**
 *
 *
 *
 *
 */


public class Main {
    //psvn egy shortcut a main method megírására
    //A fenti lenyíló listában a program argumentsben meg lehet adni argumenteket

    /**
     * This is main method
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("args-size= "+args.length);
        for (String arg:args) {
            System.out.println(arg);
        }

        /*
        *
        * printing arguments
        * another line
         */
        for (int i = 0; i < args.length; i++){
            System.out.println("args["+i+"]="+args[i]);
        }

        System.out.println(sum(1,2));
    }

    /**
     * Calculates sum of two integers
     *
     * @param a
     * @param b
     * @return
     */
    public static int sum(int a, int b){
        return a+b;
    }
}
