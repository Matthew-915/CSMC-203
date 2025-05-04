import static org.junit.Assert.*;
import org.junit.Test;

public class CoffeeTestStudent {
    @Test
    public void testPriceWithExtras() {
        Coffee coffee = new Coffee("Espresso", Size.SMALL, true, true);
        assertEquals(2.0 + 0.5 + 0.5, coffee.calcPrice(), 0.01);
    }

    @Test
    public void testPriceWithoutExtras() {
        Coffee coffee = new Coffee("Americano", Size.MEDIUM, false, false);
        assertEquals(3.0, coffee.calcPrice(), 0.01);
    }
}
