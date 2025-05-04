
import java.util.*;

public class BevShop {
    public static final int MIN_AGE_FOR_ALCOHOL = 21;
    public static final int MAX_ORDER_FOR_ALCOHOL = 3;
    public static final int MAX_FRUIT = 5;

    private ArrayList<Order> orders = new ArrayList<>();
    private Order currentOrder;

    public void startNewOrder(int time, Day day, String customerName, int age) {
        currentOrder = new Order(time, day, new Customer(customerName, age));
        orders.add(currentOrder);
    }

    public void processAlcoholOrder(String name, Size size) {
        if (isEligibleForMore()) currentOrder.addNewBeverage(name, size);
    }

    public void processSmoothieOrder(String name, Size size, int fruits, boolean protein) {
        if (fruits <= MAX_FRUIT) currentOrder.addNewBeverage(name, size, fruits, protein);
    }

    public void processCoffeeOrder(String name, Size size, boolean shot, boolean syrup) {
        currentOrder.addNewBeverage(name, size, shot, syrup);
    }

    public boolean isEligibleForMore() {
        return currentOrder.getCustomer().getAge() >= MIN_AGE_FOR_ALCOHOL &&
               currentOrder.findNumOfBeveType(Type.ALCOHOL) < MAX_ORDER_FOR_ALCOHOL;
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public double totalMonthlySale() {
        return orders.stream().mapToDouble(Order::calcOrderTotal).sum();
    }
}
