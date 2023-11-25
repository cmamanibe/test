package ProductorConsumidor;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedElement implements Delayed {
    private final long delayTime;
    private final int element;

    public DelayedElement(int element, long delayTime) {
        this.element = element;
        this.delayTime = System.currentTimeMillis() + delayTime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = delayTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if (this.delayTime < ((DelayedElement) o).delayTime) {
            return -1;
        }
        if (this.delayTime > ((DelayedElement) o).delayTime) {
            return 1;
        }
        return 0;
    }

    public int getElement() {
        return element;
    }
}

class SharedResource {
    private DelayQueue<DelayedElement> queue = new DelayQueue<>();

    public void produce(int number, long delayTime) throws InterruptedException {
        DelayedElement element = new DelayedElement(number, delayTime);
        queue.put(element);
    }

    public int consume() throws InterruptedException {
        DelayedElement element = queue.take();
        return element.getElement();
    }

}
