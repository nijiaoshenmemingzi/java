public class InvalidInputCarException extends Exception{
    private int input;
    public InvalidInputCarException (int input){
        this.input = input;
    }

    public String  getMessage() {
        return("Input "+ input +" diluar range");
    }
}
