import java.util.Scanner;

public class Minutes_years_days_2_7 {

    public static void main(String[] args) {

        System.out.println("Indsæt antal minutter der skal omregnes til år og dage:");

        Scanner input = new Scanner(System.in);

        int antalMin = input.nextInt();

        int yearsRes = antalMin/365/24/60;

        int daysRes = antalMin/24/60%365;

        System.out.println(antalMin + " omregnes til " + yearsRes + " år og " + daysRes + " dage.");
    }
}
