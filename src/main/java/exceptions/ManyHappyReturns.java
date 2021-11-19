package exceptions;




public class ManyHappyReturns {
    static int run(){
        int a = Math.random() > 0.5 ? 1 : 0;
        try {
         return 1/a ; // line X
        }
        catch(ArithmeticException ae){
            return 666; // line XX
        }
        finally {
     //       return 42; // line XXX
        }
       // return 123; // line XXXX
    }
    public static void main(String[] args) {
        System.out.println(run());
    }
  }


     /**  A. If lines X and XX are commented out, the code prints 42
        B. If line XXX is commented out, the code prints either 1 or 666
      +++  C. If lines X and XXX are commented out, the code prints 123
        D. If line XX is commented out, the code prints 123
      +++  E. If lines XX and XXX are commented out, the code prints either 1 or 123
       +++ F. If line XXXX is commented out, the code prints 42
       +++ G. If lines XXX and XXXX are commented out, the code prints either 1 or 666 */
