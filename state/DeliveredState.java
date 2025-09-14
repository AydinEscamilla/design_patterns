package state;

public class DeliveredState extends State {
    public DeliveredState(Package pkg) {
        super(pkg);
    }

    @Override
    public String getStatus() {
        return String.format(
            "The %s %s arrived.",
            pkg.getItemName(),
            pkg.getVerb("has", "have")
        );
    }

    @Override
    public String getETA() {
        return String.format(
            "The %s %s here.",
            pkg.getItemName(),
            pkg.getVerb("is", "are")
        );
    }
}
