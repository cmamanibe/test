import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

public class DelayQueueExample {
    
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<DelayedElement> delayQueue = new DelayQueue<>();

        delayQueue.put(new DelayedElement("Item 1", 3500)); // Delay of 2000 milliseconds (2 seconds)
        delayQueue.put(new DelayedElement("Item 2", 1000)); // Delay of 1000 milliseconds (1 second)
        delayQueue.put(new DelayedElement("Item 3", 3000)); // Delay of 2000 milliseconds (2 seconds)
        delayQueue.put(new DelayedElement("Item 4", 500)); // Delay of 2000 milliseconds (2 seconds)

        while (!delayQueue.isEmpty()) {
            DelayedElement element = delayQueue.take();
            System.out.println("Processing: " + element.getData());
        }
    }
}
