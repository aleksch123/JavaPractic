package exceptions;

public class Ex9 {
}
interface Prince {
    default void marryHeroine(String girl ) throws java.io.IOException {
        System.out.println("Lemme think...");
    }
}
class Charming implements Prince{
    static String prospectiveMate = "Green Fiona";
    public void marryHeroine(String girl) {
        System.out.println("Marry her?! You gotta be kidding me!");
    }
    public static void main (String[] args) {
        Prince prince = new Charming();
       // prince.marryHeroine(prospectiveMate = null);  // fail compilation here
    }
}
    /**What is the result?
        A. Lemme think…
        B. Marry her?! You gotta be kidding me!
        C. Compilation fails
        D. NullPointerException at run time*/
