package strangler_pattern_tdd;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class OldEarthTest {

    @Test
    public void nutrientShouldReutrnList() {
        OldEarth earth = new OldEarth();
        assertNotNull(earth.nutrients());
        assertTrue(earth.nutrients().contains("nitrogen"));
    }

    @Test
    public void soil() {
    }
}