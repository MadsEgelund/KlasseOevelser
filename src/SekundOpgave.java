import java.util.Scanner;

public class SekundOpgave {

        public static void main(String[] args) {

            System.out.println("Indsæt antal sekunder der skal omregnes til minutter og sekunder");

            Scanner input = new Scanner(System.in);

            int antalSekunder = input.nextInt();

            System.out.println(antalSekunder + " sekunder er omregnet til: ");

            int minutterRes = antalSekunder / 60;
            int sekunderRes = antalSekunder % 60;

            System.out.println(minutterRes + " minutter og " + sekunderRes + " sekunder");

        }
    }


