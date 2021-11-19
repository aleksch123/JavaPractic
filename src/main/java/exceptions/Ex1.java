package exceptions;

class MyException extends RuntimeException { }
class Test {
    static void run() { // line XXX
        try {
            throw Math.random()>0.5 ? new MyException() : new RuntimeException();
        }
        catch (RuntimeException rte) { System.out.print("B"); }
    }
    public static void main(String[] args) {
        try { run(); }
        catch (MyException me) { System.out.print("A"); }
    }
}
