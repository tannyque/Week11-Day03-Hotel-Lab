import java.util.ArrayList;

public class Bedroom {

//    Create instance variable
    private int number;
    private String type;
    private double rate;
    private ArrayList<Guest> guests;
    private int capacity;

    public Bedroom(int number, String type, double rate, int capacity) {
        this.number = number;
        this.type = type;
        this.rate = rate;
        this.guests = new ArrayList<>();
        this.capacity = capacity;
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

    public int getCapacity() {
        return capacity;
    }

    public int guestCount() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
        if (!isFull()) {
            this.guests.add(guest);
        }
    }

    public boolean isFull() {
        return guestCount() == this.capacity;
    }

    public Guest removeGuest() {
        return this.guests.remove(0);
    }
}
