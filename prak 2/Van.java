public class Van extends Car {
    private long basePrice;

    public Van(long basePrice){
        super(4);
        this.basePrice = basePrice;
    }
    
    public long getPrice(){
        long mile = super.getMileage();
        if((mile >= 0) && (mile <= 1000)){
            return basePrice;
        }else if((mile > 1000) && (mile <= 10000)){
            return((basePrice * 3) / 4);
        }else{
            return(basePrice/2);
        }
    }
}
