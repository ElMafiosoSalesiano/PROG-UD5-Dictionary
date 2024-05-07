package duolingo.sortoutword;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SortOut {
    private static Set<String> wordAdded = new HashSet<>();
    private static HashMap<String, Set<String>> sortWord = new HashMap<>();


    private static void wordAdd(String word){
        word.toLowerCase();
        if (word.isEmpty()) {
            System.out.println("No introdujo nada");
        }
        else{
            wordAdded.add(word);
        }
    }

    public static void sortWordAdd(){
        final Scanner SCANNER = new Scanner(System.in);
        switch () {
            case "a":
            
            break;
        case "b":
           
            break;
        case "c":

            break;
        case "d":

            break;
        case "e":

            break;
        case "f":

            break;
        case "g":

            break;
        case "h":

            break;
        case "i":

            break;
        case "j":

            break;
        case "k":

            break;
        case "m":

            break;
        case "n":

            break;
        case "ñ":

            break;
        case "o":

            break;
        case "p":

            break;
        case "q":

            break;
        case "r":

            break;
        case "s":

            break;
        case "t":

            break;
        case "u":

            break;
        case "v":

            break;
        case "w":

            break;
        case "y":

            break;
        case "z":

                break;
            default:
                System.out.println("no has introducido una palabra válida");
                break;
        }
    }
}
