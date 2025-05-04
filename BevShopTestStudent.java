import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BevShopTestStudent {
    BevShop shop;

    @Before
    public void setUp() {
        shop = new BevShop();
        shop.startNewOrder(10, Day.MONDAY, "Alice", 25);
    }

    @Test
    public void testProcessAlcoholOrder() {
        shop.processAlcoholOrder("Wine", Size.LARGE);
        assertEquals(1, shop.getCurrentOrder().getBeverages().size());
    }

    @Test
    public void testIsEligibleForMore() {
        shop.processAlcoholOrder("Wine", Size.SMALL);
        shop.processAlcoholOrder("Beer", Size.SMALL);
        shop.processAlcoholOrder("Vodka", Size.SMALL);
        assertFalse(shop.isEligibleForMore());
    }

    @Test
    public void testTotalMonthlySale() {
        double before = shop.totalMonthlySale();
        shop.processCoffeeOrder("Coffee", Size.MEDIUM, true, true);
        assertTrue(shop.totalMonthlySale() > before);
    }
}
