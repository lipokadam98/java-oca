package academy.learnprogramming;

/**
 * @author goran on 14/07/2017.
 */
public abstract class Dog extends Animal implements HasTail,CanRun{

    //Ha az interfacet nem implementálja a parent akkor a gyermeknek kötelező
    //Viszont ha a parent már implementálta akkor nem kötelező a gyermekben

    public Dog(int age) {
        super(age);
        System.out.println("Dog");
    }

    @Override
    public int getTailLength() {
        return 0;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog eating");
    }

    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
    }


}
