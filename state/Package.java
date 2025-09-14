package state;

public class Package {
    private String name;
    private int quantity;
    private State state;
    private State orderedState;
    private State inTransitState;
    private State deliveredState;

    // Constructor
    public Package(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.orderedState = new OrderedState(this);
        this.inTransitState = new InTransitState(this);
        this.deliveredState = new DeliveredState(this);
        this.state = orderedState; // initial state
    }

    // Behaviors
    public String order() {
        return state.getStatus();
    }

    public String mail() {
        setState(inTransitState);
        return state.getStatus();
    }

    public String received() {
        setState(deliveredState);
        return state.getStatus();
    }

    // State management
    public void setState(State state) {
        this.state = state;
    }

    // Getters
    public String getItemName() {
    if (quantity > 1) {
        if (name.toLowerCase().endsWith("s")) {
            return name; // already plural
        }
        return name + "s"; // add 's' only if needed
    }
    return name;
}

    public String getVerb(String singular, String plural) {
        return (quantity == 1) ? singular : plural;
    }
}