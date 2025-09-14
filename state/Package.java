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
        return state.getStatus() + "\n" + state.getETA();
    }

    public String mail() {
        setState(inTransitState);
        return state.getStatus() + "\n" + state.getETA();
    }

    public String received() {
        setState(deliveredState);
        return state.getStatus() + "\n" + state.getETA();
    }

    // State management
    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getItemName() {
        if (quantity > 1) {
            if (name.toLowerCase().endsWith("s")) {
                return name; // already plural
            }
            return name + "s"; // basic pluralization
        }
        return name;
    }

    public String getVerb(String singular, String plural) {
        return (quantity == 1) ? singular : plural;
    }
}