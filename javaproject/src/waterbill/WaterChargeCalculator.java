package waterbill;

import java.util.Scanner;

public class WaterChargeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of units of water consumed: ");
        int unitsConsumed = scanner.nextInt();

        double totalCharge = calculateWaterCharge(unitsConsumed);

        System.out.println("Total charge to be paid: Rs " + totalCharge);

        scanner.close();
    }

    private static double calculateWaterCharge(int unitsConsumed) {
        double rateFirst100 = 2.00;
        double rateNext200 = 3.00;
        double rateAbove300 = 5.00;
        double surchargeRate = 0.025; // 2.5%

        double totalCharge = 0.0;

        if (unitsConsumed <= 100) {
            totalCharge = unitsConsumed * rateFirst100;
        } else if (unitsConsumed <= 300) {
            totalCharge = 100 * rateFirst100 + (unitsConsumed - 100) * rateNext200;
        } else {
            totalCharge = 100 * rateFirst100 + 200 * rateNext200 + (unitsConsumed - 300) * rateAbove300;
            // Apply surcharge for units above 300
            totalCharge += totalCharge * surchargeRate;
        }

        return totalCharge;
    }
}