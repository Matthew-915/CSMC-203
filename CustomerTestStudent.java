import static org.junit.Assert.*;
import org.junit.Test;

public class CustomerTestStudent {

    @Test
    public void testCustomerConstructorAndGetters() {
        Customer customer = new Customer("Alice", 22);
        assertEquals("Alice", customer.getName());
        assertEquals(22, customer.getAge());
    }

    @Test
    public void testCustomerDifferentValues() {
        Customer customer = new Customer("Bob", 30);
        assertEquals("Bob", customer.getName());
        assertEquals(30, customer.getAge());
    }
}

