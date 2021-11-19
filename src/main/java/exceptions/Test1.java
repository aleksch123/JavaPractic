package exceptions;

import java.io.IOException;

public class Test1 {

    public static void main(String[] args) {
        try{
        MyTestException.run();}
        catch (IOException e){}
    }


}

 class MyTestException extends Exception{

    public static void run() throws IOException {

        throw new IOException();
    }


 }
