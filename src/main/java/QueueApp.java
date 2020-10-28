import java.util.ArrayDeque;


public class QueueApp {

    private java.util.Deque queue;


    public QueueApp() {

        queue = new ArrayDeque<>();
    }

    public void addToQueue(int value) {

        queue.addFirst(value);
    }

    public int getFirst() {

        return (int) queue.pollLast();
    }

    public int getLast() {

        return (int) queue.pollFirst();
    }


}
