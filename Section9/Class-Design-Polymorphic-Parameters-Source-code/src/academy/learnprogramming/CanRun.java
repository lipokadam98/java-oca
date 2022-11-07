package academy.learnprogramming;

/**
 * @author goran on 15/07/2017.
 */
public interface CanRun {

    void run(int speed);
    static void test(){

    }
    default int fasz(){
        return 1;
    }
}
