import java.awt.*;
import java.time.LocalDateTime;

public abstract class Alarm implements PersistentObject, Widget {
    protected final String message;
    protected boolean active;
    private LocalDateTime snoozeUntil;

    public Alarm(String message) {
        this.message = message;
        stopSnoozing();
    }

    @Override
    public String getHelpText() {
        return "I am an alarm,you can make me on or off or snooze me";
    }

    @Override
    public void save() {
        System.out.println("Saving...");
    }


    public abstract Color getColor();

    public LocalDateTime getSnoozeUntil() {
        return snoozeUntil;
    }

    public void snooze() {
        if (active)
            snoozeUntil = LocalDateTime.now().plusSeconds(3);
    }

    public boolean isSnoozing() {
        return snoozeUntil.isAfter(LocalDateTime.now());
    }

    private void stopSnoozing() {
        snoozeUntil = LocalDateTime.now().minusSeconds(1);
    }

    public void turnOn() {

        active = true;
        stopSnoozing();
    }

    public void turnOff() {
        active = false;
        stopSnoozing();
    }

    public String getReport() {
        return getReport(false);
    }

    public String getReport(boolean uppercase) {
        if (active && !isSnoozing()) {
            if (uppercase)
                return message.toUpperCase();
            else
                return message;

        } else {
            return " ";
        }
    }

    public void sendReport() {
        System.out.print(getReport(true));
    }
}
