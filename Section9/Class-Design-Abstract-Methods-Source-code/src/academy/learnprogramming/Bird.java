package academy.learnprogramming;

/**
 * @author goran on 15/07/2017.
 */
public class Bird  {

    public void fly() {
        System.out.println("Bird is flying");
    }

    public void eat(int amount) {
        System.out.println("Bird is eating " + amount + " units of food");
    }

    public static void main(String[] args) {
        Husky husky = new Husky(2);
        husky.printName();
    }
}
