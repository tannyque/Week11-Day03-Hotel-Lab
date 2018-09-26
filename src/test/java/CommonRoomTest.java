import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommonRoomTest {

    CommonRoom conference1;

    @Before
    public void setUp() {
        conference1 = new CommonRoom("Lomond Suite", 20, 100.00);
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
}
