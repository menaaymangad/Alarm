// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Alarm alarm = new HighVisabilityAlarm("pressure low");
        activate(alarm);
        printHelpText(alarm);
        saveTwice(alarm);
    }

    private static void activate(Alarm alarm) {
        alarm.turnOn();
    }

    private static void printHelpText(Widget widget) {
        System.out.println(widget.getHelpText());
    }

    private static void saveTwice(PersistentObject persistentObject) {
        persistentObject.save();
        persistentObject.save();
    }
}
