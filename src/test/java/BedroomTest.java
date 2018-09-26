import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void setUp() {
        bedroom1 = new Bedroom(1, "Double", 50.00, 2);
        guest1 = new Guest("Jack Torrance");
        guest2 = new Guest("Patrick Bateman");
        guest3 = new Guest("Thor");
    }

    @Test
    public void hasNumber() {
        assertEquals(1, bedroom1.getNumber());
    }

    @Test
    public void hasType() {
        assertEquals("Double", bedroom1.getType());
    }

    @Test
    public void hasRate() {
        assertEquals(50.00, bedroom1.getRate(), 0.01);
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom1.getCapacity());
    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(0, bedroom1.guestCount());
    }

    @Test
    public void canAddGuest() {
        bedroom1.addGuest(guest3);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void roomIsFull() {
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest2);
        assertEquals(true, bedroom1.isFull());
    }

    @Test
    public void cannotAddMoreGuestsThanCapacity() {
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest2);
        assertEquals(2, bedroom1.guestCount());
        bedroom1.addGuest(guest3);
        assertEquals(2, bedroom1.guestCount());
    }
}
