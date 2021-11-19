package exceptions;

public class Ex11{
    public double test(double d){
        if(d > 0.5) return 1;
        try{
         //   if(d < 0.1) throw new Exception("Too small!"); // line t1
        }
        catch(Exception e) {
         //   return 666; // line t2
        }
        finally {
            return 42; // line t3
        }
    }
    public static void main(String args[]){
        System.out.println(new Ex11().test(Math.random()));
    }
}
    /**Which one is true?
        A. The code always prints 42
        B. The code will fail compilation if either of lines t1 and t3 is commented out
      ++  C. The code compiles if both t1 and t2 are commented out
        D. None of the above*/
