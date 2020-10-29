import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;


public class QueueApp {

    private List<Integer> queue;


    public QueueApp() {

        queue = new ArrayList<>();
    }

    public void addToQueue(int value) {

        queue.add(value);
    }

    public int getFirst() {

        int value=queue.get(0);
        queue.remove(0);
        return value;
    }

    public int getLast() {
        int value=queue.get(queue.size()-1);
        queue.remove(queue.size()-1);

        return value;
    }


}
