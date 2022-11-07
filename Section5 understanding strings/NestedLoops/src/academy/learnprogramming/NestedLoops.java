package academy.learnprogramming;

import java.util.Arrays;

public class NestedLoops {
    public static void main(String... args){
        for(int hours = 1; hours <= 6;hours++){
            for(int minutes = 0; minutes < 60; minutes++){
                System.out.println(hours + ":"+minutes);
            }
        }

        int[][] myarray = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(myarray);
        System.out.println(Arrays.toString(myarray));

        for (int i = 0; i < myarray.length; i++){
            for(int k = 0; k < myarray[i].length;k++){
                System.out.print(myarray[i][k]+" ");
            }
            System.out.println("");
        }

        //Ha nem adunk meg labelt hanem csak simán megadnánk belül hogy break akkor csak a a belsőt
        //törné meg vagyis azt amelyikkel elsőnek találkozna label segítségével pedig befolyásolni tudjuk
        //hogy melyiket szakítsa meg

        OUTER:
        for (int[] rowArray: myarray){
            INNER:
            for(int i = 0; i < rowArray.length;i++){
                if(rowArray[i] % 2 == 0){
                    //break INNER;
                    continue INNER;
                }
                System.out.print(rowArray[i] + " ");
            }
            System.out.println("");
        }

        int x = 10;
        while(x > 0){
            do{
                //belefut és addig fut ameddig az x nagyobb mint 5
                //3. x = 3
                //5. x = 1
                x-=1;
            }while(x > 5);
            //2. x-- --> x = 4
            //4. x-- --> x = 2
            //6. x-- --> x = 0
            x--;
            System.out.println(x);
        }
        /*int[] arr1;
        int[] arr2 = new int[3];
        char[] arr3 = {'a','b'};
        arr1 = arr2;
        arr1 = arr3;*/

        //tömbben lehet megadni 0-t
        int[] array = new int[0];
        //Ha 2d vagy több array van akkor elég csak az első []-ben megadni a méretet
        int[][] array2 = new int[0][];
    }
}
