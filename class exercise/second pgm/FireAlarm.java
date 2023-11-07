public class FireAlarm {
    String message;
    private boolean active;

    public FireAlarm(String message) {
        this.message = message;
        this.active = false;
    }

    public void trigger() {
        active = true;
        System.out.println("Fire alarm activated: " + message);
    }

    public void deactivate() {
        active = false;
        System.out.println("Fire alarm deactivated.");
    }

    public void visualize() {
        if (active) {
            System.out.println("Fire Alarm Message: " + message);
            System.out.println("Status: Active");
        } else {
            System.out.println("Fire Alarm is not active.");
        }
    }

    public static void main(String[] args) {
        FireAlarm fireAlarm = new FireAlarm("Fire detected!");
        fireAlarm.visualize();

        fireAlarm.trigger();
        fireAlarm.visualize();

        fireAlarm.deactivate();
        fireAlarm.visualize();
    }
}
