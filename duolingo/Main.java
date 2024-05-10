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
        String word = SCANNER.nextLine().toLowerCase();
        SortOut.sortWordAdd(word);
        SortOut.eraseWord();
        } while (condition);
    }
}