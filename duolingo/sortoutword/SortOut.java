package duolingo.sortoutword;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SortOut {
    
    public static HashMap<String, Set<String>> sortWord = new HashMap<>();
    private static Set<String> wordA = new HashSet<>();
    private static Set<String> wordB = new HashSet<>();
    private static Set<String> wordC = new HashSet<>();
    private static Set<String> wordD = new HashSet<>();
    private static Set<String> wordE = new HashSet<>();
    private static Set<String> wordF = new HashSet<>();
    private static Set<String> wordG = new HashSet<>();
    private static Set<String> wordH = new HashSet<>();
    private static Set<String> wordI = new HashSet<>();
    private static Set<String> wordJ = new HashSet<>();
    private static Set<String> wordK = new HashSet<>();
    private static Set<String> wordM = new HashSet<>();
    private static Set<String> wordN = new HashSet<>();
    private static Set<String> wordÑ = new HashSet<>();
    private static Set<String> wordO = new HashSet<>();
    private static Set<String> wordP = new HashSet<>();
    private static Set<String> wordQ = new HashSet<>();
    private static Set<String> wordR = new HashSet<>();
    private static Set<String> wordS = new HashSet<>();
    private static Set<String> wordT = new HashSet<>();
    private static Set<String> wordU = new HashSet<>();
    private static Set<String> wordV = new HashSet<>();
    private static Set<String> wordW = new HashSet<>();
    private static Set<String> wordY = new HashSet<>();
    private static Set<String> wordZ = new HashSet<>();
    String word ="";

    public static void sortWordAdd(String word){
        char firstCharacter = word.charAt(0);
        String firstLetter = Character.toString(firstCharacter);
        switch (firstLetter) {
            case "a":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordA.add(word);
                }
                sortWord.put(firstLetter, wordA);
                System.out.println("Palabra introducida; "+ word +"." );
                break;
            case "b":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordB.add(word);
                }
                sortWord.put(firstLetter, wordB);
                System.out.println("Palabra introducida; "+ word +"." );
                break;
            case "c":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordC.add(word);
                }
                sortWord.put(firstLetter, wordC);
                System.out.println("Palabra introducida; "+ word +"." );
                break;
            case "d":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordD.add(word);
                }
                sortWord.put(firstLetter, wordD);
                System.out.println("Palabra introducida; "+ word +"." );
                break;
            case "e":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordE.add(word);
                }
                sortWord.put(firstLetter, wordE);
                System.out.println("Palabra introducida; "+ word +"." );
                break;
            case "f":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordF.add(word);
                }
                sortWord.put(firstLetter, wordF);
                System.out.println("Palabra introducida; "+ word +"." );
                break;
            case "g":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordG.add(word);
                }
                sortWord.put(firstLetter, wordG);
                System.out.println("Palabra introducida; "+ word +"." );
                break;
            case "h":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordH.add(word);
                }
                sortWord.put(firstLetter, wordH);
                System.out.println("Palabra introducida; "+ word +"." );
                break;
            case "i":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordI.add(word);
                }
                sortWord.put(firstLetter, wordI);
                System.out.println("Palabra introducida; "+ word +"." );
                break;
            case "j":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordJ.add(word);
                }
                sortWord.put(firstLetter, wordJ);
                System.out.println("Palabra introducida; "+ word +"." );
                break;
            case "k":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordK.add(word);
                }
                sortWord.put(firstLetter, wordK);
                System.out.println(sortWord);
                break;
            case "m":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordM.add(word);
                }
                sortWord.put(firstLetter, wordM);
                System.out.println(sortWord);
                break;
            case "n":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordN.add(word);
                }
                sortWord.put(firstLetter, wordN);
                System.out.println(sortWord);
                break;
            case "ñ":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordÑ.add(word);
                }
                sortWord.put(firstLetter, wordÑ);
                System.out.println(sortWord);
                break;
            case "o":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordO.add(word);
                }
                sortWord.put(firstLetter, wordO);
                System.out.println(sortWord);
                break;
            case "p":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordP.add(word);
                }
                sortWord.put(firstLetter, wordP);
                System.out.println(sortWord);
                break;
            case "q":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordQ.add(word);
                }
                sortWord.put(firstLetter, wordQ);
                System.out.println(sortWord);
                break;
            case "r":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordR.add(word);
                }
                sortWord.put(firstLetter, wordR);
                System.out.println(sortWord);
                break;
            case "s":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordS.add(word);
                }
                sortWord.put(firstLetter, wordS);
                System.out.println(sortWord);
                break;
            case "t":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordT.add(word);
                }
                sortWord.put(firstLetter, wordT);
                System.out.println(sortWord);
                break;
            case "u":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordU.add(word);
                }
                sortWord.put(firstLetter, wordU);
                System.out.println(sortWord);
                break;
            case "v":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordV.add(word);
                }
                sortWord.put(firstLetter, wordV);
                System.out.println(sortWord);
                break;
            case "w":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordW.add(word);
                }
                sortWord.put(firstLetter, wordW);
                System.out.println(sortWord);
                break;
            case "y":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordY.add(word);
                }
                sortWord.put(firstLetter, wordY);
                System.out.println(sortWord);
                break;
            case "z":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordZ.add(word);
                }
                sortWord.put(firstLetter, wordZ);
                System.out.println(sortWord);
                break;
            default:
                System.out.println("no has introducido una palabra válida");
                break;
        }
    }

    public static void eraseWord(){
        final Scanner SCANNER = new Scanner(System.in);
        System.out.println("¿Qué palabras deseas eliminar?");
        String eraseWord = SCANNER.nextLine().toLowerCase();
        char firstCharacter = eraseWord.charAt(0);
        String firstLetter = Character.toString(firstCharacter);
        switch (firstLetter) {
            case "a":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordA) {
                        if (string.equals(eraseWord)) {
                            wordA.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
            
            default:
                System.out.println("no has introducido una palabra válida");
                break;
        }
    


    }
}
