package Blatt4.ex2;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    /**
     * Returns true if the two strings are anagrams of each other.
     */
    public static boolean isAnagram (String a, String b) {
        // Remove spaces and convert to lowercase
        a = a.replaceAll ("\\s", "").toLowerCase ();
        b = b.replaceAll ("\\s", "").toLowerCase ();
        int[] arrayA = countLetters(a);
        int[] arrayB = countLetters(b);
        if (Arrays.equals(arrayA, arrayB)){
            return true;
        }
        return false;
    }
    /**
     * Helper method to count how many times each letter (a-z) appears.
     */
    public static int [] countLetters (String s) {
        int [] counts = new int [26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                counts[c - 'a']++;
            }
        }
        return counts;
    }
    /**
     * Print only letters that appear in the string with their counts.
     */
    public static void printLetterCounts (String s) {
        // TODO: implement nicely formatted output
        int [] counts = countLetters(s);
        System.out.println("Letter counts:");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                char c = (char) ('a' + i);
                System.out.println(c + ": " + counts[i]);
            }
        }
    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
    // Get two strings from the user
        System.out.print(" Enter the first string: ");
        String word1 = scanner.nextLine ();
        System.out.print(" Enter the second string: ");
        String word2 = scanner.nextLine ();
        scanner.close ();
    // TODO: Process the strings here (ignore spaces , case)
        System.out.println(" Are they anagrams? " + isAnagram (word1 , word2));
        printLetterCounts(word1);
    }
}

