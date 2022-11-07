package academy.learnprogramming;

/**
 * @author goran on 15/07/2017.
 */
public class Rabbit extends Animal {

    public Rabbit() {
        // does not compile
//        super().setAge(3);
        //super;
        //A super a parent constructorokat hívhatja és mindig az első sorban kell szerepelnie
        //A super. pedig az instance variableket illetve metódusokat
        //Ebből az okból kifolyólag egyszerre nem lehet this() és super() sem egy constructorban
        super();
//        super.setAge(3);
//        this.setAge(3);
//        setAge(3);
    }

    public Rabbit(int age) {
//        this(age); recursive call

//        this();
//        super();
//        this();
//        setAge(3);
        super(3);
    }
}
