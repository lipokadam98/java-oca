package academy.learnprogramming;

//AZ IMPORT MINDIG A PACKAGE ALATT ÉS A CLASS FELETT VAN

//Az import egy packageben lévő classra utal
import java.util.Random;
//A vizsgán lehet hogy beimportálják a systemet is pedig az redundant
import java.lang.System;

//A csillag segítségével mindent be lehet importálni egyszerre
import java.util.*;

import a.b.c.d.MyClass;
/**
 * Van amikor vizsgán nem kezdődik a program az első sorral ez amiatt van mert a kérdés
 * nem a packagekre irányul és ezért lehagyták hogy helyet spóroljanak
 * olyan is lehet hogy szándékosan 1 sorba írnak be több dologot is szintén helytakarékosság
 * szempontjából.
 * Ilyenkor érdemes a papírra leírni a kódot és úgy kielemezni mivel egyszerűbb lesz a megértése
 * a vizsgán szoktak olyat is csinálni hogy a b c d elnevezésű packageket szoktak létrehozni
 */
public class ImportExample {

    public static void main(String[] args) {
        Random random = new Random();
        //A systemet tartalmazó java.lang package automatikusan beimportálódik
        System.out.println(random.nextInt(5));
        MyClass myClass = new MyClass();
    }
}
