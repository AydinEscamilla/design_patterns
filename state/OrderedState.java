package state;

public class OrderedState extends State {
    private int days;

    public OrderedState(Package pkg) {
        super(pkg);
        this.days = random.nextInt(2) + 1; // 1–2 days until shipping
    }

    @Override
    public String getStatus() {
        return String.format(
            "The %s %s ordered\nThe %s %s be shipped within %d business days",
            pkg.getItemName(),
            pkg.getVerb("is", "are"),
            pkg.getItemName(),
            pkg.getVerb("will", "will"),
            days
        );
    }

    @Override
    public String getETA() {
        return days + " business days";
    }
}
