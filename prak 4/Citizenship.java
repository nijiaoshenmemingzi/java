/**
 * citizenship.java
 * [Jelaskan kegunaan class ini]
 * @author 18220014 Pavita Andrea
 */

public abstract class Citizenship {
    private String surname;
    private String givenName;

    public Citizenship(String surname, String givenName) {
        // Konstruktor
        this.surname = surname;
        this.givenName = givenName;
    }

    public String getSurname() {
        // Mengembalikan atribut surname
        return surname;
    }

    public String getGivenName() {
        // Mengembalikan atribut givenName
        return givenName;
    }

    public abstract void speak();
}