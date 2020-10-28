


public class Day16 {


    public static void main(String[] args) throws Exception {

        QueueApp app = new QueueApp();

        for (int i = 1; i < 5; i++) {
            app.addToQueue(i);
            System.out.println("Add value "+i+" to queue");
        }
        System.out.println();

        System.out.println("Last  in = "+app.getLast());
        System.out.println("Last  in = "+app.getLast());
        System.out.println("First in = "+app.getFirst());



    }



}




