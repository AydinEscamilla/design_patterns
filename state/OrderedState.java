/**
 * Author: Aydin Escamilla
 * CSCE247
 */
package state;

/**
 * {@code OrderedState} extends {@link State} and shows a newly-placed order
 * 
 * It will also convey delays at this stage of the package process (pre-shipment)
 */
public class OrderedState extends State {
    private int days;
    private boolean delayed;

    /**
     * Constructs {@code OrderedState} with a random total preparation time
     * The base for this time is 2 days, with a 20% chance to extend by 1-3 days
     * 
     * @param pkg is the package associated at this point
     */
    public OrderedState(Package pkg) {
        super(pkg);
        this.days = 2; // base time
        this.delayed = random.nextInt(100) < 20; // 20% chance

        if (delayed) {
            int extraDays = random.nextInt(3) + 1; // 1–3 days
            this.days += extraDays;
        }
    }

    /**
     * Returns a string for the order status
     * 
     * @return is a message confirming the ordering of the package
     */
    @Override
    public String getStatus() {
        return String.format(
            "The %s %s ordered.",
            pkg.getItemName(),
            pkg.getVerb("is", "are")
        );
    }

    /**
     * Will return a string for the expected shipping time
     * Any delays are conveyed to the user as additional information
     * 
     * @return is a message for when the package will eventually ship off
     */
    @Override
    public String getETA() {
        StringBuilder eta = new StringBuilder();
        if (delayed) {
            eta.append(String.format(
                "The %s %s experienced a slight delay in manufacturing.\n",
                pkg.getItemName(),
                pkg.getVerb("has", "have")
            ));
        }
        eta.append(String.format(
            "The %s will be shipped within %d business days.",
            pkg.getItemName(),
            days
        ));
        return eta.toString();
    }
}
