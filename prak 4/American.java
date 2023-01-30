/**
 * American.java
 * [Jelaskan kegunaan class ini]
 * @author 18220014 Pavita Andrea
 */

public class American extends Citizenship {
    private String state;

    public American(String surname, String givenName, String state) {
        // Konstruktor
        super(surname, givenName);
        this.state = state;
    }

    public String getState() {
        // Mengembalikan atribut state
        return state;
    }

    @Override
    public void speak() {
        // Mencetak "Hello buddy!" diakhiri newline
        System.out.println("Hello buddy!");
    }
}