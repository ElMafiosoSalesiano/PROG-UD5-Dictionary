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
    private static Set<String> wordX = new HashSet<>();
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
            case "x":
            if (word.isEmpty()) {
                System.out.println("No introdujo nada");
            } else {
                wordX.add(word);
            }
            sortWord.put(firstLetter, wordX);
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
                case "e":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordE) {
                        if (string.equals(eraseWord)) {
                            wordE.remove(eraseWord);
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
                case "x":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordX) {
                        if (string.equals(eraseWord)) {
                            wordX.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("No existen letras almacenadas con esa inicial.");
                }
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
    
    public static void findWord(){
        final Scanner SCANNER = new Scanner(System.in);
        System.out.println("palabra que quieras buscar");
        String word = SCANNER.nextLine().toLowerCase().trim();
        char firstCharacter = word.charAt(0);
        String firstLetter = Character.toString(firstCharacter);
        switch (firstLetter) {
            case "a":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordA) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "b":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordB) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "c":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordC) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "d":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordD) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "e":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordE) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "f":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordF) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "g":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordG) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "h":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordH) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "i":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordI) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "j":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordJ) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "k":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordK) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "m":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordM) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "n":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordN) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "ñ":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordÑ) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "o":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordO) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "p":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordP) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "q":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordQ) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "r":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordR) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "s":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordS) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "t":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordT) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "u":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordU) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "v":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordV) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "w":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordW) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "x":
            if (word.isEmpty()) {
                System.out.println("No introdujo nada");
            } else {
                for (String string : wordX) {
                    if (word.equals(string)) {
                        System.out.println("palabra encontrada con éxito: " + word);
                    }
                }
            }
            case "y":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordY) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            case "z":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    for (String string : wordZ) {
                        if (word.equals(string)) {
                            System.out.println("palabra encontrada con éxito: " + word);
                        }
                    }
                }
                break;
            default:
                System.out.println("no has introducido una palabra válida");
                break;
        }
    }

    public static void showInitials(){
        final Scanner SCANNER = new Scanner(System.in);
        System.out.println("Todas las iniciales que guardan palabras;");
        if (wordA.isEmpty() && wordB.isEmpty() && wordC.isEmpty() && wordD.isEmpty() && wordE.isEmpty() && wordF.isEmpty() && wordG.isEmpty() && wordH.isEmpty() && wordI.isEmpty()
        && wordJ.isEmpty() && wordK.isEmpty() && wordM.isEmpty() && wordN.isEmpty() && wordO.isEmpty() && wordP.isEmpty() && wordQ.isEmpty() && wordR.isEmpty() &&
        wordS.isEmpty() && wordT.isEmpty() && wordU.isEmpty() && wordV.isEmpty() && wordW.isEmpty() && wordX.isEmpty() && wordY.isEmpty() && wordZ.isEmpty()) {
            sortWord.remove("a");
            sortWord.remove("b");
            sortWord.remove("c");
            sortWord.remove("d");
            sortWord.remove("e");
            sortWord.remove("f");
            sortWord.remove("g");
            sortWord.remove("h");
            sortWord.remove("i");
            sortWord.remove("j");
            sortWord.remove("k");
            sortWord.remove("m");
            sortWord.remove("n");
            sortWord.remove("ñ");
            sortWord.remove("o");
            sortWord.remove("p");
            sortWord.remove("q");
            sortWord.remove("r");
            sortWord.remove("s");
            sortWord.remove("t");
            sortWord.remove("u");
            sortWord.remove("v");
            sortWord.remove("w");
            sortWord.remove("x");
            sortWord.remove("y");
            sortWord.remove("z");
            System.out.println("ninguna letra contiene palabras almacenadas");
            
        } else {
           
            if (sortWord.get("a") == null) {
                sortWord.remove("a");
            } else {
                if (sortWord.containsKey("a") && wordA.isEmpty()) {
                    
                } else {
                    System.out.println("La inicial " + " 'a' " + " tiene palabras guardadas.");
                }
            }
                
            if (sortWord.get("b") == null) {
                sortWord.remove("b");
            } else {
                if (sortWord.containsKey("b") && wordB.isEmpty()) {
                    
                } else {
                    System.out.println("La inicial " + " 'b' " + " tiene palabras guardadas.");
                }
            }
                
            if (sortWord.get("c") == null) {
                sortWord.remove("c");
            } else {
                if (sortWord.containsKey("c") && wordC.isEmpty()) {
                    
                } else {
                    System.out.println("La inicial " + " 'c' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("d") == null) {
                sortWord.remove("d");
            } else {
                if (sortWord.containsKey("d") && wordD.isEmpty()) {
                    
                } else {
                    System.out.println("La inicial " + " 'c' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("e") == null) {
                sortWord.remove("e");
            } else {
                if (sortWord.containsKey("e") && wordE.isEmpty()) {
                    
                } else {
                    System.out.println("La inicial " + " 'e' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("f") == null) {
                sortWord.remove("f");
            } else {
                if (sortWord.containsKey("f") && wordF.isEmpty()) {
                } else {
                    System.out.println("La inicial " + " 'f' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("g") == null) {
                sortWord.remove("g");
            } else {
                if (sortWord.containsKey("g") && wordG.isEmpty()) {
                } else {
                    System.out.println("La inicial " + " 'g' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("h") == null) {
                sortWord.remove("h");
            } else {
                if (sortWord.containsKey("h") && wordH.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("La inicial " + " 'h' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("i") == null) {
                sortWord.remove("i");
            } else {
                if (sortWord.containsKey("i") && wordI.isEmpty()) {
                } else {
                    System.out.println("La inicial " + " 'i' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("i") == null) {
                sortWord.remove("i");
            } else {
                if (sortWord.containsKey("i") && wordI.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("La inicial " + " 'i' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("j") == null) {
                sortWord.remove("j");
            } else {
                if (sortWord.containsKey("j") && wordJ.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("La inicial " + " 'j' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("k") == null) {
                sortWord.remove("k");
            } else {
                if (sortWord.containsKey("k") && wordK.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("La inicial " + " 'k' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("m") == null) {
                sortWord.remove("m");
            } else {
                if (sortWord.containsKey("m") && wordM.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("La inicial " + " 'm' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("n") == null) {
                sortWord.remove("n");
            } else {
                if (sortWord.containsKey("n") && wordN.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("La inicial " + " 'n' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("ñ") == null) {
                sortWord.remove("ñ");
            } else {
                if (sortWord.containsKey("ñ") && wordÑ.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("La inicial " + " 'ñ' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("o") == null) {
                sortWord.remove("o");
            } else {
                if (sortWord.containsKey("o") && wordO.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("La inicial " + " 'o' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("p") == null) {
                sortWord.remove("p");
            } else {
                if (sortWord.containsKey("p") && wordP.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("La inicial " + " 'p' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("q") == null) {
                sortWord.remove("q");
            } else {
                if (sortWord.containsKey("q") && wordQ.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("La inicial " + " 'q' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("r") == null) {
                sortWord.remove("r");
            } else {
                if (sortWord.containsKey("r") && wordR.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("La inicial " + " 'r' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("s") == null) {
                sortWord.remove("s");
            } else {
                if (sortWord.containsKey("s") && wordS.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("La inicial " + " 's' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("t") == null) {
                sortWord.remove("t");
            } else {
                if (sortWord.containsKey("t") && wordT.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("La inicial " + " 't' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("u") == null) {
                sortWord.remove("u");
            } else {
                if (sortWord.containsKey("u") && wordU.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("La inicial " + " 'u' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("v") == null) {
                sortWord.remove("v");
            } else {
                if (sortWord.containsKey("v") && wordV.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("La inicial " + " 'v' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("w") == null) {
                sortWord.remove("w");
            } else {
                if (sortWord.containsKey("w") && wordW.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("La inicial " + " 'w' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("x") == null) {
                sortWord.remove("x");
            } else {
                if (sortWord.containsKey("x") && wordX.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("La inicial " + " 'x' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("y") == null) {
                sortWord.remove("y");
            } else {
                if (sortWord.containsKey("y") && wordY.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("La inicial " + " 'y' " + " tiene palabras guardadas.");
                }
            }
            if (sortWord.get("z") == null) {
                sortWord.remove("z");
            } else {
                if (sortWord.containsKey("z") && wordZ.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("La inicial " + " 'z' " + " tiene palabras guardadas.");
                }
            }

        }
    }
}
