package numbers;

import java.util.Scanner;

public class NumberNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 9: ");
        int number = scanner.nextInt();

        if (number >= 0 && number <= 9) {
            String numberName = getNumberName(number);
            System.out.println("Number name: " + numberName);
        } else {
            System.out.println("Please enter a number between 0 and 9.");
        }

        scanner.close();
    }

    private static String getNumberName(int number) {
        switch (number) {
            case 0:
                return "Z\te\tr\to";
            case 1:
                return "O\tn\te";
            case 2:
                return "T\tw\to";
            case 3:
                return "T\th\tr\te\te";
            case 4:
                return "F\to\tu\tr";
            case 5:
                return "F\ti\tv\te";
            case 6:
                return "S\ti\tx";
            case 7:
                return "S\te\tv\te\tn";
            case 8:
                return "E\ti\tg\th\tt";
            case 9:
                return "N\ti\tn\te";
            default:
                return "Invalid";
        }
    }
}