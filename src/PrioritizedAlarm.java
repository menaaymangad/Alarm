import java.awt.*;

public class PrioritizedAlarm extends Alarm {
    private final int priority;

    public PrioritizedAlarm(String message, int priority) {
        super(message);
        this.priority = priority;
    }

    @Override
    public Color getColor() {
        return Color.GREEN;
    }

    public int getPriority() {
        return priority;
    }

    public static void main(String[] args) {
        PrioritizedAlarm prioritizedAlarm = new PrioritizedAlarm("Temperature is too high", 6);
        prioritizedAlarm.turnOn();
        System.out.println(prioritizedAlarm.getReport());
        prioritizedAlarm.sendReport();
    }

}
