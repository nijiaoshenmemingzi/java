public class Bus extends Car{
    private int maxCapacity;

    public Bus(int maxCapacity){
        //Konstruktor
        super(6);
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity(){
        return maxCapacity;
    }

    public String toString(){
        String Wheels = String.valueOf(super.getNumberOfWheels());
        String Mil = String.valueOf(super.getMileage());
        String Maxcap = String.valueOf(getMaxCapacity());
        return("Number of Wheels: " + Wheels + ", Mileage: " + Mil + ", Max Capacity: " + Maxcap);
    }

    public long getPrice(){
        long mile = super.getMileage();
        if((mile >= 0) && (mile <= 10000)){
            return(1000000 * maxCapacity);
        }else{
            return(500000 * maxCapacity);
        }
    }
    
}