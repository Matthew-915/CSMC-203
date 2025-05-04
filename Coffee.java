
public class Coffee extends Beverage {
    private boolean extraShot, extraSyrup;

    public Coffee(String name, Size size, boolean extraShot, boolean extraSyrup) {
        super(name, Type.COFFEE, size);
        this.extraShot = extraShot;
        this.extraSyrup = extraSyrup;
    }

    public double calcPrice() {
        double price = getBasePrice();
        switch (getSize()) {
            case MEDIUM: price += getSizePrice(); break;
            case LARGE: price += 2 * getSizePrice(); break;
            default: break;
        }
        if (extraShot) price += 0.5;
        if (extraSyrup) price += 0.5;
        return price;
    }

    public String toString() {
        return super.toString() + " Coffee: Extra Shot - " + extraShot + ", Extra Syrup - " + extraSyrup + ", Price: " + calcPrice();
    }
}