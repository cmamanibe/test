package ProductorConsumidor;

import java.util.concurrent.ThreadLocalRandom;

class Producer implements Runnable {
    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {

                int number = ThreadLocalRandom.current().nextInt(0, 100);
                int time = ThreadLocalRandom.current().nextInt(1000, 3000);
                resource.produce(number, time);
                System.out.println("Produced: " + number + " in " + time + "ms");
                // Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 2000));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
