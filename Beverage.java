
public abstract class Beverage {
    private String name;
    private Size size;
    private Type type;
    private final double BASE_PRICE = 2.0;
    private final double SIZE_PRICE = 1.0;

    public Beverage(String name, Type type, Size size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    public abstract double calcPrice();

    public double getBasePrice() {
        return BASE_PRICE;
    }

    public double getSizePrice() {
        return SIZE_PRICE;
    }

    public Size getSize() {
        return size;
    }

    public String toString() {
        return name + ", " + size;
    }
    public Type getType() {
        return type;
    }
}