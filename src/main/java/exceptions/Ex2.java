package exceptions;

import java.io.IOException;

public class Ex2 {
        public static void main(String[] args)  {
            try { doStuff(); }
            catch (IOException ioe){ System.out.println(ioe); }
        }
        static void doStuff() throws IOException  {
            if (Math.random() > 0.5) throw new IOException();
            throw new RuntimeException();
        }

    }

    /**Which two modifications, made independently, will permit the code to compile?
        A. Adding throws IOException to the main() method signature
        B. Adding throws IOException to the doStuff() method signature
       +++ C. Adding throws IOException to the main() method signature and to the doStuff()
        method signature
       +++ D. Adding throws IOException to the doStuff() method signature and changing the
        catch argument to IOException
        E. Adding throws IOException to the main() method signature and changing the
        catch argument to IOException*/
