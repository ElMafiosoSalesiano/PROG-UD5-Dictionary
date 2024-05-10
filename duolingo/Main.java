package duolingo;

import java.util.Scanner;

import duolingo.sortoutword.SortOut;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        final Scanner SCANNER = new Scanner(System.in);
        boolean condition = true;
        do {
        System.out.println("introduce palabre");
        String word = SCANNER.nextLine().toLowerCase().trim();
        SortOut.sortWordAdd(word);
        SortOut.eraseWord();
        SortOut.findWord();
        SortOut.showInitials();
        SortOut.wordsByInitials();
        } while (condition);
    }
}