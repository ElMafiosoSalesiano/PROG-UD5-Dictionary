package duolingo.sortoutword;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SortOut {
    
    public static Map<String, Set<String>> sortWord = new HashMap<>();
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
        String eraseWord = SCANNER.nextLine().toLowerCase().trim();
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
                case "b":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordB) {
                        if (string.equals(eraseWord)) {
                            wordB.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "c":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordC) {
                        if (string.equals(eraseWord)) {
                            wordC.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "d":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordD) {
                        if (string.equals(eraseWord)) {
                            wordD.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "f":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordF) {
                        if (string.equals(eraseWord)) {
                            wordF.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "g":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordG) {
                        if (string.equals(eraseWord)) {
                            wordG.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "h":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordH) {
                        if (string.equals(eraseWord)) {
                            wordH.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "i":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordI) {
                        if (string.equals(eraseWord)) {
                            wordI.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "j":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordJ) {
                        if (string.equals(eraseWord)) {
                            wordJ.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "k":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordK) {
                        if (string.equals(eraseWord)) {
                            wordK.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "m":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordM) {
                        if (string.equals(eraseWord)) {
                            wordM.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "n":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordN) {
                        if (string.equals(eraseWord)) {
                            wordN.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "ñ":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordÑ) {
                        if (string.equals(eraseWord)) {
                            wordÑ.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "o":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordO) {
                        if (string.equals(eraseWord)) {
                            wordO.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "p":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordP) {
                        if (string.equals(eraseWord)) {
                            wordP.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "q":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordQ) {
                        if (string.equals(eraseWord)) {
                            wordQ.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "r":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordR) {
                        if (string.equals(eraseWord)) {
                            wordR.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "s":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordS) {
                        if (string.equals(eraseWord)) {
                            wordS.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "t":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordT) {
                        if (string.equals(eraseWord)) {
                            wordT.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "u":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordU) {
                        if (string.equals(eraseWord)) {
                            wordU.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "v":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordV) {
                        if (string.equals(eraseWord)) {
                            wordV.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "w":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordW) {
                        if (string.equals(eraseWord)) {
                            wordW.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "y":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordY) {
                        if (string.equals(eraseWord)) {
                            wordY.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
                break;
                case "z":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordZ) {
                        if (string.equals(eraseWord)) {
                            wordZ.remove(eraseWord);
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
