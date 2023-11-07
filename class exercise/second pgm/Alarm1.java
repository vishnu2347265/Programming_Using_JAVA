public class Alarm1 {
    String message;
    private boolean active;

    public Alarm1(String message) {
        this.message = message;
        this.active = false;
    }

    public void visualize() {
        if (active) {
            System.out.println("Alarm Message: " + message);
            System.out.println("Status: Active");
        } else {
            System.out.println("Alarm is not active.");
        }
    }

    public void register() {
        active = true;
        System.out.println("Alarm has been registered.");
    }

    public static void main(String[] args) {
        Alarm1 myAlarm = new Alarm1("Wake up!");
        myAlarm.visualize();

        myAlarm.register();
        myAlarm.visualize();
    }
}
