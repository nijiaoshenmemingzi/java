/**
 * Animal.java
 * buat animal
 * @author 18220014 Pavita Andrea
 */
public abstract class Animal implements HavePower{
    private int rawPower;
    private String habitat;

    public Animal (int rawPower , String Habitat){
        this.habitat = Habitat;
        this.rawPower = rawPower;
    }

    public String getHabitat() {
        return habitat;
    }

    public int getRawPower (){
        return rawPower;
    }

    public boolean isStrongerThan (HavePower other){
        if (rawPower > other.getRawPower()){
            return true;
        }
        else{
            return false;
        }
    }

    public void fight (Animal other){
        if (rawPower > other.getRawPower() && habitat == other.getHabitat()){
            this.rawPower = this.rawPower + other.getRawPower();
        }
    }

    public abstract void speak();
}
