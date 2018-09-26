import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;

    @Before
    public void setUp() {
        hotel = new Hotel("Bates Motel");
    }

    @Test
    public void hasName() {
        assertEquals("Bates Motel", hotel.getName());
    }
}
