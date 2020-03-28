package programmingchallenges1;

/**
 * @author noname
 */
public class RetailItem {
    public RetailItem(String d,double p){
        description=d;
        price=p;
    }
    private final String description;
    private volatile int unitsOnHand;
    private final double price;

    /**
     * @return the unitsOnHand
     */
    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    /**
     * @param unitsOnHand the unitsOnHand to set
     */
    public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }
}
