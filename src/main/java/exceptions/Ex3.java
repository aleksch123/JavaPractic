package exceptions;

class Ex3 {
    public static void main(String[] args) throws Exception {
        doStuff();
        System.out.println("Done!");
    }
    private static void doStuff() throws Exception {
        System.out.println("Starting... ");
        if (Math.random() > 0.5) throw new Exception();
        System.out.print ("Finishing... ");
    }
}
    /**Which two are possible outcomes?
        A. Starting…
        B. Starting… Finishing…
      +++  C. Starting… Finishing… Done!
        +++ D. Starting… and Exception in thread "main" java.lang.Exception*/
