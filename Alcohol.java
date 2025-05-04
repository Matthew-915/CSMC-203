
public class Alcohol extends Beverage {
    private boolean isWeekend;

    public Alcohol(String name, Size size, boolean isWeekend) {
        super(name, Type.ALCOHOL, size);
        this.isWeekend = isWeekend;
    }

    public double calcPrice() {
        double price = getBasePrice();
        switch (getSize()) {
            case MEDIUM: price += getSizePrice(); break;
            case LARGE: price += 2 * getSizePrice(); break;
            default: break;
        }
        if (isWeekend) price += 0.6;
        return price;
    }

    public String toString() {
        return super.toString() + " Alcohol: Weekend - " + isWeekend + ", Price: " + calcPrice();
    }
}
