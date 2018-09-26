import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;

    @Before
    public void setUp() {
        bedroom1 = new Bedroom(1, "Double", 50.00);
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
}
