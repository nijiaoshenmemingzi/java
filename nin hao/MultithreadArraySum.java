public class MultithreadArraySum {
    // nWorkers menyatakan jumlah maximum threads yang tersedia
    private int nWorkers;
    // array menyatakan array masukan
    private Integer[] array;
    private int sum;

    MultithreadArraySum(int nWorkers, Integer[] array) {
        // Inisialisasi attributes
        // Please provide your solution in the space below
        this.nWorkers = nWorkers;
        this.array = array;
        this.sum = 0;
    }

    public int calculateSum() throws InterruptedException {
        // calculateSum akan membuat thread dan memetakan array masukan secara rata ke
        // semua threads yang dapat dibuat
        // gunakan in-line class untuk membuat thread
        // Please provide your solution in the space below
        Thread[] threads = new Thread[nWorkers];
        int chunkSize = array.length / nWorkers;

        for (int i = 0; i < nWorkers; i++) {
            int start = i * chunkSize;
            int end = (i == nWorkers - 1) ? array.length : (i + 1) * chunkSize;
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    int localSum = findSum(start, end);
                    synchronized (this) {
                        sum += localSum;
                    }
                }
            });
            threads[i].start();
        }

        // wait for all threads to finish
        for (int i = 0; i < nWorkers; i++) {
            threads[i].join();
        }

        return sum;
    }

    protected int findSum(int start, int end) {
        // findSum akan melakukan penjumlahan elemen-elemen array pada index `start`
        // sampai `end-1`
        // Please provide your solution in the space below
        int localSum = 0;
        for (int i = start; i < end; i++) {
            localSum += array[i];
        }
        return localSum;
    }
}