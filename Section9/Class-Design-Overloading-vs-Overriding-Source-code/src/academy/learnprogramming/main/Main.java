package academy.learnprogramming.main;

import academy.learnprogramming.Dog;
import academy.learnprogramming.Husky;

/**
 * @author goran on 14/07/2017.
 */
public class Main {

    public static void main(String[] args) {
        //Overloading és az overriding az nagyon hasonló viszont a fontos különbség az az hogy amíg az overriding ugyanazokat a paramétereket használja
        //Addig az overloading más paramétereket

        //a metódusnak amit overrideolni akar ugyanannak kell lennie visszatérési értékben és paraméterben illetve névben is
        //private és protected metódusokat nem lehet overrideolni
        //override során lehet magasabb access modifiert adni a metódusnak mint ami a parentből visszajön de kisebbet nem
        //pl protected a szülőben de a gyermekben mér public lesz
        Husky husky = new Husky(5);
        husky.printDetails();

        Dog dog = new Dog(3);
        dog.setName("Rex");
        dog.printDetails();

        husky.eat();
        System.out.println("avg= " + husky.getAverageWeight());
    }
}
