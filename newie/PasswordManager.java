import java.util.ArrayList;

public class PasswordManager {
    /*
     * Atribut yang menyimpan password yang telah dienkripsi
     */
    private static ArrayList<String> passwords;
    private static ArrayList<Integer> shifts;

    /*
     * Konstruktor untuk PasswordManager
     * Inisialisasi array list passwords dan shifts
     */
    public PasswordManager() {
        passwords = new ArrayList<String>();
        shifts = new ArrayList<Integer>();
    }

    /*
     * Asumsi seluruh input a-z
     * Enkripsi dilakukan dengan cara menggeser karakter sebanyak shift
     * Contoh: encrypt(qwerty,2) = sygtva
     * Anda diizinkan untuk membuat fungsi helper dengan akses private
     * yang melakukan shifting dari suatu character
     * @param password, password yang akan dienkripsi
     * @param shift, jumlah pergeseran
     */
    public static StringBuilder encrypt(String password, int shift) {
        String retval = "";
        char x;
        for (int i = 0; i < password.length();i++)
        {
            x = cipher(password.charAt(i),shift);
            retval = retval + x;
        }
        StringBuilder retval1 = new StringBuilder(retval);
        return retval1;
    }

    /*
     * Dekripsi password yang sudah dienkrip
     * @param password
     * @param shift
     */
    public static StringBuilder decrypt(String password, int shift) {
        return encrypt(password,-shift);
    }

    /*
     * Method untuk menambahkan password baru
     * Gunakan method encrypt
     * @param password password baru yang akan ditambahkan
     * @param shift jumlah shift enkripsi
     */
    public static void addPassword(String password, int shift) {
        StringBuilder pass = encrypt(password, shift);
        passwords.add(pass.toString());
    }

    /*
     * Method untuk mengambil password
     * @param index indeks password yang akan diambil
     */
    public static String retrievePassword(int indeks) {
        return passwords.get(indeks);
    }

    private static char cipher(char c, int shift)
    {
        int ascii = (int) c;
        ascii += shift;
        if (ascii > 122)
        {
            ascii -= 26;
        }
        else if (ascii < 97)
        {
            ascii += 26;
        }
        return (char) ascii;
    }
}