/**
 * Author: Aydin Escamilla
 * CSCE247
 */
package state;

/**
 * {@code InTransitState} extends {@link State} and represents the package being shipped
 * 
 * There is a base shipping time and a random chance to extend it by a random time within a range
 */
public class InTransitState extends State {
    private int days;
    private boolean delayed;

    /**
     * Constructs {@code InTransitState} with randomized delivery aspects
     * Base time is 5 days, with a 30% chance to add 1-7 days
     * 
     * @param pkg is the package associated
     */
    public InTransitState(Package pkg) {
        super(pkg);
        this.days = 5; // base transit time
        this.delayed = random.nextInt(100) < 30; // 30% chance

        if (delayed) {
            int extraDays = random.nextInt(7) + 1; // 1–7 days
            this.days += extraDays;
        }
    }

    /**
     * Returns a string for the current shipping status
     * 
     * @return is a message confirming the package going out for delivery
     */
    @Override
    public String getStatus() {
        return String.format(
            "The %s %s out for delivery.",
            pkg.getItemName(),
            pkg.getVerb("is", "are")
        );
    }

    /**
     * Returns a string with the estimated time of arrival
     * If the delay chance triggers, this is conveyed to the user
     * 
     * @return is an ETA message for the package in-transit
     */
    @Override
    public String getETA() {
        StringBuilder eta = new StringBuilder();
        if (delayed) {
            eta.append(String.format(
                "The %s %s experienced a delay in shipping.\n",
                pkg.getItemName(),
                pkg.getVerb("has", "have")
            ));
        }
        eta.append(String.format(
            "The %s should arrive within %d business days.",
            pkg.getItemName(),
            days
        ));
        return eta.toString();
    }
}
