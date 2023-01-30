/**
 * Bear.java
 * buat bear
 * @author 18220014 Pavita Andrea
 */
public class Bear extends Animal implements Carnivore,Herbivore{
    public Bear (){
        super(125, "MOUNTAIN");
    }

    public Bear (int rawPower){
        super(rawPower, "MOUNTAIN");
    }

    public void speak(){
        System.out.println("I'm a Good Bear.");
    }

    public void eatMeat(){
        System.out.println("I'm eating a meat.");
    }

    public void hunt (Animal animal){
        if (this.getRawPower() > animal.getRawPower()){
            eatMeat();
        }
    }

    public void eatPlant (){
        System.out.println("I'm eating a plant.");
    }
}
