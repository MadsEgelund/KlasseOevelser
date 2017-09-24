import java.sql.Time;
import java.util.Scanner;

public class CurrentTime_2_8 {

    public static void main(String[] args) {

        long totalMili = System.currentTimeMillis();

        long totalSeconds = totalMili/1000;

        long currentSecond = totalSeconds%60;

        long totalMinutes = totalSeconds/60;

        long currentMinute = totalMinutes%60;

        long totalHour = totalMinutes/60;

        long currentHour = totalHour%24;

        System.out.println("Klokken er nu " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT. Angiv den ønskede tidsforskel der skal omregnes:");

        Scanner input = new Scanner(System.in);

        int tidsForskel = input.nextInt();

        long totalSecondsOmregnet = totalMili/1000 + tidsForskel;

        long currentSecondOmregnet = totalSecondsOmregnet%60;

        long totalMinuteOmregnet = totalSecondsOmregnet/60 + tidsForskel;

        long currentMinuteOmregnet = totalMinuteOmregnet%60;

        long totalHourOmregnet = totalMinuteOmregnet/60 + tidsForskel;

        long currentHourOmregnet = totalHourOmregnet%24;

        System.out.println("Klokken er " + currentHourOmregnet + ":" + currentMinuteOmregnet + ":" + currentSecondOmregnet +  " GMT(" + tidsForskel + ").");

    }


}
