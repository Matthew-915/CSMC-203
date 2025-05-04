
import java.util.*;

public class Order {
    private Customer customer;
    private int time;
    private Day day;
    private ArrayList<Beverage> beverages;

    public Order(int time, Day day, Customer customer) {
        this.time = time;
        this.day = day;
        this.customer = customer;
        this.beverages = new ArrayList<>();
    }

    public void addNewBeverage(String name, Size size, boolean extraShot, boolean extraSyrup) {
        beverages.add(new Coffee(name, size, extraShot, extraSyrup));
    }

    public void addNewBeverage(String name, Size size, int fruits, boolean protein) {
        beverages.add(new Smoothie(name, size, fruits, protein));
    }

    public void addNewBeverage(String name, Size size) {
        beverages.add(new Alcohol(name, size, day == Day.SATURDAY || day == Day.SUNDAY));
    }

    public double calcOrderTotal() {
        return beverages.stream().mapToDouble(Beverage::calcPrice).sum();
    }

    public int findNumOfBeveType(Type type) {
        return (int) beverages.stream().filter(b -> b.getType() == type).count();
    }

    public ArrayList<Beverage> getBeverages() { return beverages; }
    public Customer getCustomer() { return customer; }
    public String toString() { return "Order by: " + customer + ", Items: " + beverages; }
}

