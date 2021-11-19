package exceptions;

public class Ex6 {
}
 class BruisedKnee {
    private static void run() { tripOverCat(); }
    private static void tripOverCat() {
      try {
          throw new Exception();
      }catch (Exception e){}
    }
    public static void main (String[] args) {
        run();
    }
}
    /**What modification will make the code compile and run successfully?
       +++ A. Wrap up the throw new Exception() statement in a try-catch block that catches
        a Throwable
        B. Wrap up the call to tripOverCat() in a try-catch block that catches an Exception
        C. Add throws Exception to the signature of run()
        D. Add throws Exception to the signature of run() and wrap up the call to
        tripOverCat() in a try-catch block that catches an Exceptio*/
