package state;

public class OrderedState extends State {
    private int days;
    private boolean delayed;

    public OrderedState(Package pkg) {
        super(pkg);
        this.days = 2; // base time
        this.delayed = random.nextInt(100) < 20; // 20% chance

        if (delayed) {
            int extraDays = random.nextInt(3) + 1; // 1–3 days
            this.days += extraDays;
        }
    }

    @Override
    public String getStatus() {
        return String.format(
            "The %s %s ordered.",
            pkg.getItemName(),
            pkg.getVerb("is", "are")
        );
    }

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
