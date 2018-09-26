import java.util.ArrayList;

public class CommonRoom {

    private String name;
    private int capacity;
    private double rate;
    private ArrayList<Guest> guests;


    public CommonRoom(String name, int capacity, double rate) {
        this.name = name;
        this.capacity = capacity;
        this.rate = rate;
        this.guests = new ArrayList<>();
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
