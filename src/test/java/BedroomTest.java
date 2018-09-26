import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;

    @Before
    public void setUp() {
        bedroom1 = new Bedroom(1);
    }

    @Test
    public void hasName() {
        assertEquals(1, bedroom1.getNumber());
    }
}
