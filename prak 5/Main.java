import java.lang.System ;
import java.util.Scanner ;
public class Main {
    public static void main (String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>() ;
        Scanner scanner = new Scanner(System.in) ;
        int jumlahOperasi = scanner.nextInt() ;
        for (int i = 0; i < jumlahOperasi; i++) {
            String operasi = scanner.next() ;

            if (operasi.equals("PUT")) {
                String key = scanner.next() ;
                int value = scanner.nextInt() ;
                hashMap.put(key, value) ;
            }
            else if (operasi.equals("REMOVE")) {
                String key = scanner.next() ;
                hashMap.remove(key) ;
            }
            else if (operasi.equals("GET")) {
                String key = scanner.next() ;
                if (hashMap.get(key) == null) {
                    System.out.println("null") ;
                }
                else {
                    System.out.println(hashMap.get(key)) ;
                }
            }
            else if (operasi.equals("CLEAR")) {
                hashMap.clear() ;
            }
        }
    }
}
