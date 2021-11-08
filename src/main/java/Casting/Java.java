package Casting;

    public class Java extends Coffee {
        public void run(){ System.out.println("Java"); }
        public static void main(String[] args) {
            Plant pl = new Java();
            Plant p2 = new Coffee();
            Plant p3 = new Java();
            pl = p3;
            Plant p4 =  p3;
            pl.run();
            p4.run();
        }
    }


