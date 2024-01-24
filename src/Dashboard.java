import java.util.ArrayList;
import java.util.List;

public class Dashboard {
    private final List<Alarm> allAlarms = new ArrayList<>();

    public static void main(String[] args) {
        Alarm alarm1 = new HighVisabilityAlarm("pressure low");
        Alarm alarm2 = new PrioritizedAlarm("skfjslkf", 5);

        Dashboard dashboard = new Dashboard();
        dashboard.add(alarm1);
        dashboard.add(alarm2);

        dashboard.printBigReport();
    }

    public void add(Alarm alarm) {
        alarm.turnOn();
        allAlarms.add(alarm);
    }

    public void printBigReport() {
        for (Alarm alarm : allAlarms) {
            System.out.println(alarm.getReport(true));
        }
    }
}
