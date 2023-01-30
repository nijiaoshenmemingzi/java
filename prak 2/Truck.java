public class Truck extends Car{
    private boolean loaded;

    public Truck(int numberOfWheels, boolean loaded){
        super(numberOfWheels);
        this.loaded = loaded;
    }

    public boolean isLoaded(){
        return(loaded);
    }

    public void load(){
        loaded = true;
    }

    public void unload(){
        loaded = false;
    }

    @Override
    public String toString() {
        String Wheels = String.valueOf(super.getNumberOfWheels());
        String Mil = String.valueOf(super.getMileage());
        String Load = String.valueOf(isLoaded());
        return("Number of Wheels: " + Wheels + ", Mileage: " + Mil + ", Is Loaded: " + Load);
    }

    public long getPrice(){
        return(5000000 * (super.getNumberOfWheels()));
    }
}