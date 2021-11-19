package livecode;

import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {
        solutionViaFor();
    }

    public static void solutionViaStream(){
        IntStream.rangeClosed(1,100).mapToObj(i->i%3==0 ? ((i%5==0) ? "livecode.FizzBuzz":"Fizz"):(i%5==0 ? "Buzz": i)).forEach(System.out::println);
    }
    public static void solutionViaFor(){
        for (int i = 1; i <=100 ; i++) {

            if((i%3!=0)&&(i%5!=0)) System.out.println(i);
            if((i%3==0)&&(i%5==0)) System.out.println("livecode.FizzBuzz");
            else if(i%3==0) System.out.println("Fizz");
            else if(i%5==0) System.out.println("Buzz");

        }
    }
}
