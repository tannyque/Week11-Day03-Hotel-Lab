import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommonRoomTest {

    CommonRoom conference1;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void setUp() {
        conference1 = new CommonRoom("Lomond Suite", 20, 100.00);
        guest1 = new Guest("Jack Torrance");
        guest2 = new Guest("Patrick Bateman");
        guest3 = new Guest("Thor");
    }

    @Test
    public void hasName() {
        assertEquals("Lomond Suite", conference1.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(20, conference1.getCapacity());
    }

    @Test
    public void hasRate() {
        assertEquals(100.00, conference1.getRate(), 0.01);
    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(0, conference1.guestCount());
    }

    @Test
    public void canAddGuest() {
        conference1.addGuest(guest3);
        assertEquals(1, conference1.guestCount());
    }

    @Test
    public void roomIsFull() {
        CommonRoom conference2 = new CommonRoom("Ness Suite", 2, 0);
        conference2.addGuest(guest1);
        conference2.addGuest(guest2);
        assertEquals(true, conference2.isFull());
    }

    @Test
    public void cannotAddMoreGuestsThanCapacity() {
        CommonRoom conference2 = new CommonRoom("Ness Suite", 2, 0);
        conference2.addGuest(guest1);
        conference2.addGuest(guest2);
        assertEquals(2, conference2.guestCount());
        conference2.addGuest(guest3);
        assertEquals(2, conference2.guestCount());
    }

    @Test
    public void removesGuest() {
        conference1.addGuest(guest3);
        conference1.addGuest(guest2);
        assertEquals(true, conference1.removeGuest(guest3));
    }

    @Test
    public void returnsGuestList() {
        conference1.addGuest(guest1);
        conference1.addGuest(guest3);
        assertEquals(2, conference1.getGuestList().size());
    }

}
