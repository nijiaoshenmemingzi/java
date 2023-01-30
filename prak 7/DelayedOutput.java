public class DelayedOutput {
  public static void printDelayed(int delayMillisec, String output) {
      Thread thisthread = new Thread() {
        public void run() {
              
        try {
            Thread.sleep(delayMillisec);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(output);
        }       
      }
      };
      thisthread.start();
      
  }
}