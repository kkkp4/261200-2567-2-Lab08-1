import java.util.Random;
class NumberPrinter extends Thread {
    private int threadNumber;
    private static final Random random = new Random();

    public NumberPrinter(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Thread #" + threadNumber + ": " + i);

            // Adding a random delay to simulate real-time behavior
            try {
                Thread.sleep(random.nextInt(1000)); // Random sleep between 0-99 ms
            } catch (InterruptedException e) {
                return;  // stop timer
            }
        }
    }
}
