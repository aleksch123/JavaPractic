public class Java extends Coffee {
    public void run(){ System.out.println("Java"); }
    public static void main(String[] args) {
        Plants pl = new Java();
        Plants p2 = new Coffee();
        Plants p3 = new Java();
        pl =  p3;
        Plants p4 =  p3;
        pl.run();
        p4.run();
    }
}
