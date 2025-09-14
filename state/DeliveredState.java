/**
 * Author: Aydin Escamilla
 * CSCE247
 */
package state;


/**
 * {@code DeliveredState} extends {@link State} and represents the final stage of a {@link Package}
 * 
 * There are no further transitions from this point, as the package is handed off
 */
public class DeliveredState extends State {
    
    /**
     * Constructs a new {@code DeliveredState} for the package
     * 
     * @param pkg is the package associated
     */
    public DeliveredState(Package pkg) {
        super(pkg);
    }

    /**
     * Returns a string describing the delivery status of the package
     * 
     * @return is a message confirming arrival
     */
    @Override
    public String getStatus() {
        return String.format(
            "The %s %s arrived.",
            pkg.getItemName(),
            pkg.getVerb("has", "have")
        );
    }

    /**
     * Returns a string for the estimated time of arrival
     * Here, it's a confirmation of delivery specifically
     * 
     * @return is a message that says the package has arrived
     */
    @Override
    public String getETA() {
        return String.format(
            "The %s %s here.",
            pkg.getItemName(),
            pkg.getVerb("is", "are")
        );
    }
}
