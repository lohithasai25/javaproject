package capcount;

import java.util.Scanner;

public class StringAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        int vowelsCount = 0;
        int consonantsCount = 0;
        int capitalLettersCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }

                if (Character.isUpperCase(ch)) {
                    capitalLettersCount++;
                }
            }
        }

        System.out.println("Total number of vowels: " + vowelsCount);
        System.out.println("Total number of consonants: " + consonantsCount);
        System.out.println("Total number of capital letters: " + capitalLettersCount);
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
