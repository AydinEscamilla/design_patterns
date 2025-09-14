/**
 * Author: Aydin Escamilla
 * CSCE247
 */
package state;

/**
 * {@code Package} represents the item being tracked throughout the delivery process
 * 
 * Each package will be linked its state, determining current status/ETA
 * State transitions will occur between ordering to mailing and mailing to receiving
 */
public class Package {
    private String name;
    private int quantity;
    private State state;
    private State orderedState;
    private State inTransitState;
    private State deliveredState;

    /**
     * Constructs a new package with an initial OrderedState
     * 
     * @param name is the name of the shipped item
     * @param quantity is the number of said to be shipped
     */
    public Package(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.orderedState = new OrderedState(this);
        this.inTransitState = new InTransitState(this);
        this.deliveredState = new DeliveredState(this);
        this.state = orderedState; // initial state
    }

    /**
     * This is the initiation of the ordering process
     * 
     * @return is a message that conveys the status and ETA
     */
    public String order() {
        return state.getStatus() + "\n" + state.getETA();
    }

    /**
     * Puts the package into the {@link InTransitState}
     * 
     * @return is a message that shows the progress of the package
     */
    public String mail() {
        setState(inTransitState);
        return state.getStatus() + "\n" + state.getETA();
    }

    /**
     * Puts the package into the {@link DeliveredState}
     * 
     * @return is a message conveying delivery completion
     */
    public String received() {
        setState(deliveredState);
        return state.getStatus() + "\n" + state.getETA();
    }

    /**
     * Update processor for the package's state transitions
     * 
     * @param state is the *new* state of the package
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Fetches the current state of the package
     * 
     * @return is the *current* state of the package
     */
    public State getState() {
        return state;
    }

    /**
     * Gets a name for the item
     * 
     * @return is the item name provided
     */
    public String getName() {
        return name;
    }

    /**
     * Gets a final name for the item after deciding whether plurality needs to be considered
     * 
     * @return is the name of the item to be used henceforth (potentially adjusted for #)
     */
    public String getItemName() {
        if (quantity > 1) {
            if (name.toLowerCase().endsWith("s")) {
                return name; // already plural
            }
            return name + "s"; // basic pluralization
        }
        return name;
    }

    /**
     * Gets a verb, which verb being dependent on plurality
     * 
     * @param singular is the singular form of the verb
     * @param plural is the plural form of the verb
     * @return passes the appropriate form verb to use
     */
    public String getVerb(String singular, String plural) {
        return (quantity == 1) ? singular : plural;
    }
}