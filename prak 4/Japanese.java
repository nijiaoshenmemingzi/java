/**
 * Japanese.java
 * [Jelaskan kegunaan class ini]
 * @author 18220014 Pavita Andrea
 */

public class Japanese extends Citizenship {
    private String favouriteAnime;

    public Japanese(String surname, String givenName, String favouriteAnime) {
        // Konstruktor
        super(surname, givenName);
        this.favouriteAnime = favouriteAnime;
    }

    public String getFavouriteAnime() {
        // Mengembalikan atribut favouriteAnime
        return favouriteAnime;
    }

    @Override
    public void speak() {
        // Mencetak "Hai, Watashi wa Mal-san desu!" diakhiri newline
        System.out.println("Hai, Watashi wa Mal-san desu!");
    }
}