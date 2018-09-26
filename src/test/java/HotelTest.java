import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Guest guest1;
    Guest guest2;
    CommonRoom diningRoom;


    @Before
    public void setUp() {
        hotel = new Hotel("Bates Motel");
        bedroom1 = new Bedroom(1, "Double", 120.00, 2);
        guest1 = new Guest("Jack Torrance");
        guest2 = new Guest("Loki");
        diningRoom = new CommonRoom("Millennium Scran", 20, 0.0);
    }

    @Test
    public void hasName() {
        assertEquals("Bates Motel", hotel.getName());
    }

    @Test
    public void hasZeroBedrooms() {
        assertEquals(0, hotel.getBedroomCount());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.getBedroomCount());
    }

    @Test
    public void hotelGuestListStartsEmpty() {
        assertEquals(0, hotel.guestCount());
    }

    @Test
    public void canAddGuestToHotel() {
        hotel.addGuest(guest1);
        assertEquals(1, hotel.guestCount());
    }

    @Test
    public void canRemoveGuestFromHotel() {
        hotel.addGuest(guest1);
        assertEquals(true, hotel.removeGuest(guest1));
        assertEquals(0, hotel.guestCount());
    }

    @Test
    public void hotelCanAddGuestToBedroom() {
        hotel.addGuest(guest1);
        hotel.assignGuestToRoom(bedroom1, guest1);
        assertEquals(1, bedroom1.guestCount());

    }

    @Test
    public void hotelCanRemoveGuestFromBedroom() {
        hotel.addGuest(guest1);
        hotel.assignGuestToRoom(bedroom1, guest1);
        hotel.removeGuestFromRoom(bedroom1, guest1);
        assertEquals(0, bedroom1.guestCount());
    }

    @Test
    public void hotelCanGetBedroomGuestList() {
        hotel.addGuest(guest1);
        hotel.addGuest(guest2);
        hotel.assignGuestToRoom(bedroom1, guest1);
        hotel.assignGuestToRoom(bedroom1, guest2);
        assertEquals(2, hotel.getRooomGuestList(bedroom1).size());
    }

    @Test
    public void hotelCanAddGuestToDiningRoom(){
        hotel.addGuest(guest1);
        hotel.addGuest(guest2);
        hotel.assignGuestToRoom(diningRoom, guest1);
        hotel.assignGuestToRoom(diningRoom, guest2);
        assertEquals(2, diningRoom.guestCount());

    }



}
