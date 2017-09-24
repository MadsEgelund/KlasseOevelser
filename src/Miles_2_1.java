import java.util.Scanner;

public class Miles_2_1 {

    public static void main(String[] args) {

        System.out.println("Indsæt miles:");

        Scanner input = new Scanner(System.in);

        double antalMiles = input.nextInt();

        double kilometerRes = antalMiles * 1.6;

        System.out.println(antalMiles + " miles svarer til " + kilometerRes + " kilometer");


    }
}
