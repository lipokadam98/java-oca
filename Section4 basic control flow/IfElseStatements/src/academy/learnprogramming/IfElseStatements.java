package academy.learnprogramming;

public class IfElseStatements {
    public static void main(String[] args) {

        boolean b = false;

        if(!b){
            System.out.println("false");
        }else{
            System.out.println("true");
        }


        int testScore = 76;
        char grade;

        if(testScore >= 90){
            grade = 'A';
        }else if(testScore  >= 80){
            grade = 'B';
        }else if( testScore >= 70){
            grade = 'C';
        }else if(testScore >= 60){
            grade = 'D';
        }else if(testScore >= 50){
            grade = 'E';
        }else{
            grade = 'F';
        }

        System.out.println("grade= "+grade);

        int hoursOfDay = 10;
        if(hoursOfDay < 11) System.out.println("Morning");
        else if(hoursOfDay < 17) System.out.println("Evening");
        else



            System.out.println("Day");

        hoursOfDay++;
        //Ügyelni kell a sorrendre mivel nem jut el az else if részig
        if(hoursOfDay < 17){
            System.out.println("Afternoon");
        }else if(hoursOfDay < 11){
            System.out.println("Morning");
        }else {
            System.out.println("Evening");
        }
    }
}
