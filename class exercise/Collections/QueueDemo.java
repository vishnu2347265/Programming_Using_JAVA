import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> groceryQueue = new LinkedList<>();
        groceryQueue.add("Apple");
        groceryQueue.add("Orange");
        groceryQueue.add("Banana");

        System.out.println("First customer: " + groceryQueue.remove());
        System.out.println("Next customer: " + groceryQueue.peek());
    }
}
