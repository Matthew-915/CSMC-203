import static org.junit.Assert.*;
import org.junit.Test;

public class SmoothieTestStudent {
    @Test
    public void testSmoothieWithProtein() {
        Smoothie smoothie = new Smoothie("Berry", Size.SMALL, 3, true);
        assertEquals(2.0 + 3 * 0.5 + 1.5, smoothie.calcPrice(), 0.01);
    }

    @Test
    public void testSmoothieWithoutProtein() {
        Smoothie smoothie = new Smoothie("Banana", Size.LARGE, 2, false);
        assertEquals(4.0 + 2 * 0.5, smoothie.calcPrice(), 0.01);
    }
}