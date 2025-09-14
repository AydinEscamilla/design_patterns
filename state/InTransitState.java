package state;

public class InTransitState extends State {
    private int days;
    private boolean delayed;

    public InTransitState(Package pkg) {
        super(pkg);
        this.days = 5; // base transit time
        this.delayed = random.nextInt(100) < 30; // 30% chance

        if (delayed) {
            int extraDays = random.nextInt(7) + 1; // 1–7 days
            this.days += extraDays;
        }
    }

    @Override
    public String getStatus() {
        return String.format(
            "The %s %s out for delivery.",
            pkg.getItemName(),
            pkg.getVerb("is", "are")
        );
    }

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
