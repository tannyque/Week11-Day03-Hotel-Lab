import java.util.ArrayList;
import java.util.BitSet;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Guest> guests;


    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.guests = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public int getBedroomCount() {
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }


    public int guestCount() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }


    public boolean removeGuest(Guest guestToRemove) {
        return this.guests.remove(guestToRemove);
    }

    public void assignGuestToRoom(Bedroom bedroom, Guest guest) {
        bedroom.addGuest(guest);
    }

    public void assignGuestToRoom(CommonRoom commonRoom, Guest guest) {
        commonRoom.addGuest(guest);
    }

    public void removeGuestFromRoom(Bedroom bedroom, Guest guest) {
        bedroom.removeGuest(guest);
    }

    public ArrayList<Guest> getRooomGuestList(Bedroom bedroom) {
        return bedroom.getGuestList();
    }


    public ArrayList<Bedroom> getVacantBedrooms() {

        ArrayList<Bedroom> vacantRooms = new ArrayList<>();

        for (Bedroom bedroom : this.bedrooms){
            if (bedroom.guestCount() == 0){
                vacantRooms.add(bedroom);
            }
        }

        return vacantRooms;
    }
}
