import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class OrderTestStudent {
    Order order;

    @Before
    public void setUp() {
        order = new Order(12, Day.FRIDAY, new Customer("Dave", 22));
    }

    @Test
    public void testAddBeverageAndCalcTotal() {
        order.addNewBeverage("Beer", Size.SMALL);
        order.addNewBeverage("Smoothie", Size.LARGE, 3, true);
        assertEquals(2, order.getBeverages().size());
        assertTrue(order.calcOrderTotal() > 0);
    }

    @Test
    public void testFindNumOfBevType() {
        order.addNewBeverage("Latte", Size.SMALL, true, true);
        order.addNewBeverage("Espresso", Size.MEDIUM, false, false);
        assertEquals(2, order.findNumOfBeveType(Type.COFFEE));
    }
}

