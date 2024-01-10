package asif;

import java.util.Scanner;

public class LeafCollectionProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of leaves samples collected: ");
        int leaves = scanner.nextInt();

        int[] result = calculateRoundsAndLeaves(leaves);

        switch (result[0]) {
            case 0:
                System.out.println("\nNo round was completed");
                break;
            default:
                System.out.println("\nThe number of rounds is: " + result[0]);
                System.out.println("\nThe number of leaves collected: " + leaves);
                break;
        }

        scanner.close();
    }

    private static int[] calculateRoundsAndLeaves(int leaves) {
        int round = 0;

        while (leaves >= 30) {
            round++;
            leaves -= 30;
        }

        return new int[]{round, leaves};
    }
}


