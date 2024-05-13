package duolingo;

import java.util.Scanner;

import duolingo.sortoutword.SortOut;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        final Scanner SCANNER = new Scanner(System.in);
        boolean stillOn = true;
        String menu = """
                1.-Add word.
                2.-Erase word.
                3.-Is this word exist?.
                4.-Show avaible initials.
                5.-Show words by his initials.
                6.-Close programm.
                """;
        do {
            System.out.println(menu);
            System.out.println("Write the number of the option showed on the menu for choosing it");
            String chooseOption = SCANNER.nextLine();
            switch (chooseOption) {
                case "1":
                    System.out.println("Give me a word to add at the dictionary");
                    String word = SCANNER.nextLine().toLowerCase().trim();
                    SortOut.sortWordAdd(word);
                    break;
                case "2":
                    SortOut.eraseWord();
                    break;
                case "3":
                    SortOut.findWord();
                    break;
                case "4":
                    SortOut.showInitials();
                    break;
                case "5":
                    SortOut.wordsByInitials();;
                    break;
                case "6":
                    System.out.println("Thanks for use the dictionary");
                    System.out.println("System close");
                    stillOn = false;
                    break;
                default:
                    System.out.println("You dont give a correct option");
                    break;
            }
        } while (stillOn);

        SCANNER.close();
           
    }
}