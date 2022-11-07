package academy.learnprogramming;

/**
 * @author goran on 18/07/2017.
 */
public interface Run extends Walk {

    //Tehát ha van két interface és mind a kettőben ugyanaz a default metódus és egyszerre implementálja az osztály akkor
    //hibát kapunk ezt pedig úgy lehet fixálni ha az egyik interface extendeli a másikat
    default int getSpeed() {
        return 10;
    }
}
