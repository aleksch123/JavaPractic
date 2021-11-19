package exceptions;

public class Ex12 {
    public static void main(String[] args) {
        System.out.println(solution(11));
    }
    public  static int solution(int somenum){

        try {
            if (somenum > 10) return 10;
            else throw new Exception("Some Ex");
        }catch (Exception e){}
        finally {
            return 42;
        }

    }
}
