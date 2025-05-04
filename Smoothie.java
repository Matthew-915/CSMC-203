
public class Smoothie extends Beverage {
    private int numOfFruits;
    private boolean addProtein;

    public Smoothie(String name, Size size, int numOfFruits, boolean addProtein) {
        super(name, Type.SMOOTHIE, size);
        this.numOfFruits = numOfFruits;
        this.addProtein = addProtein;
    }

    public double calcPrice() {
        double price = getBasePrice();
        switch (getSize()) {
            case MEDIUM: price += getSizePrice(); break;
            case LARGE: price += 2 * getSizePrice(); break;
            default: break;
        }
        price += numOfFruits * 0.5;
        if (addProtein) price += 1.5;
        return price;
    }

    public String toString() {
        return super.toString() + " Smoothie: Fruits - " + numOfFruits + ", Protein - " + addProtein + ", Price: " + calcPrice();
    }
}