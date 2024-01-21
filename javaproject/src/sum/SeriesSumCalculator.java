package sum;

import java.util.Scanner;

public class SeriesSumCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of p: ");
        double p = scanner.nextDouble();

        if (p < 2.5) {
            System.out.println("Invalid input. The value of p cannot be smaller than 2.5.");
        } else {
            double sum = calculateSeriesSum(p);
            System.out.println("Sum of the series up to term " + p + " is: " + sum);
        }

        scanner.close();
    }

    private static double calculateSeriesSum(double p) {
        double sum = 0.0;
        double currentTerm = 2.5;

        while (currentTerm <= p) {
            sum += currentTerm;
            currentTerm += 2.0; 
        }

        return sum;
    }
}