/**
 * @author [NIM] [Nama]
 */
public class DelayedCounting {
    public static void printDelayed(int delayMillisec, int maxCount) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= maxCount; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(delayMillisec);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
    }

    public static void main(String[] args) {
        printDelayed(1000, 10);
        printDelayed(0, 10);
    }
}

