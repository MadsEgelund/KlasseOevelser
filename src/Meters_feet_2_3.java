import java.util.Scanner;

public class Meters_feet_2_3 {

    public static void main(String[] args) {

        System.out.println("Indsæt antal meter der skal omregnes til fod:");

        Scanner input = new Scanner(System.in);

        double meterAntal = input.nextDouble();

        double fodRes = meterAntal*3.2786;

        System.out.println(meterAntal + " er " + fodRes + " fod");

    }
}
