import java.awt.*;

public class HighVisabilityAlarm extends Alarm{
    HighVisabilityAlarm(String message){
        super(message);
    }

    @Override
    public Color getColor() {
        return Color.ORANGE;
    }

    @Override
    public String getReport(boolean uppercase){
        String report=super.getReport(uppercase);

            if (message.isEmpty()){
                return report;

            }
            else
                return report+"!";
        }

    public static void main(String[] args) {
        HighVisabilityAlarm alarm=new HighVisabilityAlarm("Temperature is too high");
        alarm.sendReport();
    }


}

