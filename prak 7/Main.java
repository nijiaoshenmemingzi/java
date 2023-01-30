import java.util.*;
import java.lang.Runnable;
import java.lang.Thread;

public class Main extends Thread{
    
    public static void main(String[] args) {
        Thread t1;
        Scanner scanner = new Scanner(System.in) ;
        int balance = scanner.nextInt();
        DebitCard d = new DebitCard(balance);
        int a = scanner.nextInt();
        List<Thread> threads = new ArrayList<Thread>();
        for (int i =0 ; i< a ;i++){
            String input = scanner.next();
            int amount = scanner.nextInt();
            
            if (input.equals("W")){
                
                t1 = new Thread(new Runnable(){public void run(){d.withdraw(amount);}});
            }
            else{
                t1 = new Thread(new Runnable(){public void run(){d.deposit(amount);}});
            }
            threads.add(t1);
        }
        scanner.close();
        for (int i =0 ; i< a ;i++){
            threads.get(i).start();
        }
        d.printTransactionsHistory();

    }
}
