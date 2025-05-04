import static org.junit.Assert.*;
import org.junit.Test;

public class AlcoholTestStudent {
    @Test
    public void testAlcoholPriceWithWeekend() {
        Alcohol drink = new Alcohol("Wine", Size.MEDIUM, true);
        assertEquals(3.6, drink.calcPrice(), 0.01);
    }

    @Test
    public void testAlcoholPriceWithoutWeekend() {
        Alcohol alcohol = new Alcohol("Beer", Size.SMALL, false);
        assertEquals(2.0, alcohol.calcPrice(), 0.01);
    }
}
