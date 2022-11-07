package academy.learnprogramming;

public class TernaryOperator {
    public static void main(String[] args) {
        int x = 10;
        int y;

        if(x > 5) y = 2 * x;
        else y = 4 * x;


        System.out.println("y = "+y);

        //Ternary operator

        //y = x > 5 ? 2 * x : 4 * x;

        //System.out.println("y = "+y);

        y = (x > 5) ? (2 * x) : (4 * x); //nicer to read

        System.out.println("y = "+y);

        //not same datatype example

        System.out.println(y > 5 ? 10: "Test");

        //Csak azonos datatype mehet a myInt változóba
        //int myInt = y > 10 ? myShort2 * myShort : "test";
        short myShort = 2;
        short myShort2 = 6;
        double myDouble = 100.0;

        //System.out.println(y);

        int myInt = y > 10 ? myShort2 * myShort : (int) myDouble * (myShort * myShort2);


        System.out.println(myInt);


        int a = 1;
        int b = 1;
        //A 42-ik sor lefutása előtt
        //a=1
        //b=1
        int c= a < 10 ? a++ : b++;

        //A 42-ik sor lefutása utána
        //a=2
        //b=1
        //c=1

        System.out.println(a+" , "+b+ " , "+ c);

        int d = 1;
        int e = 2;
        int f = 3;

        if(d < 10){
            f = d++ < 1 ? e++ : f++;
            //f = f
            //f = 3
            //d = 2
            //e = 2
        }else{
            f = (d + e) < 2 ? d++ : e++;
        }

        //else ágat nem kell vizsgálni mivel nem fog belefutni

        System.out.println("d="+d);
        System.out.println("e="+e);
        System.out.println("f="+f);

    }
}

