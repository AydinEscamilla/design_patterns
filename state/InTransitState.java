package state;

public class InTransitState extends State {
    private int days;

    public InTransitState(Package pkg) {
        super(pkg);
        this.days = random.nextInt(5) + 1; // 1–5 days for delivery
    }

    @Override
    public String getStatus() {
        return String.format(
            "The %s %s out for delivery\nThe %s %s arrive within %d business days",
            pkg.getItemName(),
            pkg.getVerb("is", "are"),
            pkg.getItemName(),
            pkg.getVerb("should", "should"),
            days
        );
    }

    @Override
    public String getETA() {
        return days + " business days";
    }
}
