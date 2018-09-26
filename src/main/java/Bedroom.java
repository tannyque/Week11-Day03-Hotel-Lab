public class Bedroom {

//    Create instance variable
    private int number;
    private String type;
    private double rate;

    public Bedroom(int number, String type, double rate) {
        this.number = number;
        this.type = type;
        this.rate = rate;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public double getRate() {
        return rate;
    }
}
