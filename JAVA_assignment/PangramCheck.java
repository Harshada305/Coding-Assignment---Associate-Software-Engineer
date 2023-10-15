package Coding_Assignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramCheck {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();
        scanner.close();

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        Set<Character> uniqueLetters = new HashSet<>();
        
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueLetters.add(c);
            }
        }

        return uniqueLetters.size() == 26;
        // 26 letters from A to Z
    }
}
