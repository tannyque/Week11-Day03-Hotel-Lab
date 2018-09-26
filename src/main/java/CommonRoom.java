public class CommonRoom {

    private String name;
    private int capacity;
    private double rate;

    public CommonRoom(String name, int capacity, double rate) {
        this.name = name;
        this.capacity = capacity;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getRate() {
        return rate;
    }
}
