import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Trekant_2_2 {

    public static void main(String[] args) {

        System.out.println("Indsæt længden og højden på den ligesidet trekant:");

        Scanner input = new Scanner(System.in);

        double trekantLength = input.nextDouble();

        double trekantArea = (sqrt(3)/4)*pow(trekantLength, 2);

        double trekantVolume = trekantArea*trekantLength;

        System.out.println("Trekantens areal er: " + trekantArea);

        System.out.println("Trekantens rumfang er: " + trekantVolume);

    }
}
