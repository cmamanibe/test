package ProductorConsumidor;

import java.util.concurrent.ThreadLocalRandom;

class Consumer implements Runnable {
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {

                int number = resource.consume();
                System.out.println("Consumed: " + number);
                // Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 3000));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
