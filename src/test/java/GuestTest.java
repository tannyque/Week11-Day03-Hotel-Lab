import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

//    declaration

    Guest guest1;

    @Before
    public void setUp() {
        guest1 = new Guest("Jack Torrance");
    }

    @Test
    public void hasName() {
        assertEquals("Jack Torrance", guest1.getName());
    }
}
