package academy.learnprogramming;

public class DeclaringAndInitializingVariables {
    public static void main(String[] args) {
        //declasring an initializing in two lines

        //Figyelni kell arra hogy egy változó inicializálva legyen mielőtt
        // hivatkozunk rá egyébként compilation errort kapunk
        int myNumber; //declaration
        //Ez itt nem fog lefutni
        //System.out.println("myNumber= "+myNumber);
        myNumber = 10; //initialization
        System.out.println("myNumber= "+myNumber);

        double myDouble = 7.50;

        System.out.println("myDouble= "+myDouble);

        float myFloat1,myfloat2,myfloat3;

    }
}
