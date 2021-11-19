package exceptions;

import java.io.IOException;

public class Test3 {

    public static void main(String[] args) {
        System.out.println(excEx(5));
    }

 public static int excEx(int input){

     try{ if (input<10) throw new IOException();
         else return 5;
     }catch (IOException ioe){
         return 1;
     }finally {
         System.out.println("finally always completed");
     }


 }
}


