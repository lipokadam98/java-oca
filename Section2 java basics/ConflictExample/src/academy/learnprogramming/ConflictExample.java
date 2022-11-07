package academy.learnprogramming;

//import java.util.*;
//import java.sql.*;

//Ha olyan conflict van hogy egy Class name szerepel 2 packageben is akkor
//érdemes a kódban megadni a package nevet és nem az importoknál megtenni ezt
//mivel ha egyszerre két helyről is szeretnénk ugyanazt beimportálni azonos néven
//akkor a compiler nem fogja tudni hogy melyiket szeretnénk valójában használni

public class ConflictExample {

    public static void main(String[] args) {
        java.util.Date date;
        java.sql.Date sqlDate;
    }
}
