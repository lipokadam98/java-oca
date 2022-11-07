package academy.learnprogramming.main;

import academy.learnprogramming.Animal;
import academy.learnprogramming.Dog;
import academy.learnprogramming.Husky;

/**
 * @author goran on 14/07/2017.
 */
public class Main {

    public static void main(String[] args) {

        //Abstract osztályokat nem lehet a new keyworddel létrehozni
        //nem lehetnek sem private sem pedig final classok
        //Abstarct osztályoknak lehet 0 tól n darab számig terjedően abstract metódusa
        //Ha egy abstract class leszármazik egy másik abstract classból akkor az összes abstract metódusát megörökli
        //Ha egy abstract classból származik le egy nem abstract class akkor kötelező implementálnia az abstract class összes metódusát
        Husky husky = new Husky(5);
        husky.printDetails();

        Dog dog = new Dog(3);
        dog.setName("Rex");
        dog.printDetails();

        husky.eat();
        System.out.println("avg= " + husky.getAverageWeight());


    }
}
