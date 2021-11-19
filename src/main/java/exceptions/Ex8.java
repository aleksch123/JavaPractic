package exceptions;

public class Ex8 {
}
class Thrower {
    public static void main(String[] args) {
        try {
            doStuff();
            System.out.print("A");
        }
        catch(RuntimeException rte) { System.out.print("B"); }
        finally { System.out.print("C"); }
    }
    public static void doStuff() {
        if (Math.random() > 0.5) throw new RuntimeException();
        doMoreStuff();
        System.out.print("D");
    }
    public static void doMoreStuff() {
        System.out.print("E");
    }
}

   /** What is the maximum number of letters the code can print?
        A. One
        B. Two
        C. Three
      +++  D. Four
        E. All five
        F. The code prints nothing because compilation fail*/

