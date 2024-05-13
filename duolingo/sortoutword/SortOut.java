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
    private static Set<String> wordL = new HashSet<>();
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
    String word = "";

    public static void sortWordAdd(String word) {
        char firstCharacter = word.charAt(0);
        String firstLetter = Character.toString(firstCharacter);
        switch (firstLetter) {
            case "a":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordA.add(word);
                }
                sortWord.put(firstLetter, wordA);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "b":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordB.add(word);
                }
                sortWord.put(firstLetter, wordB);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "c":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordC.add(word);
                }
                sortWord.put(firstLetter, wordC);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "d":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordD.add(word);
                }
                sortWord.put(firstLetter, wordD);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "e":
                if (word.isEmpty()) {
                    System.out.println("");
                } else {
                    wordE.add(word);
                }
                sortWord.put(firstLetter, wordE);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "f":
                if (word.isEmpty()) {
                    System.out.println("No introdujo nada");
                } else {
                    wordF.add(word);
                }
                sortWord.put(firstLetter, wordF);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "g":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordG.add(word);
                }
                sortWord.put(firstLetter, wordG);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "h":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordH.add(word);
                }
                sortWord.put(firstLetter, wordH);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "i":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordI.add(word);
                }
                sortWord.put(firstLetter, wordI);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "j":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordJ.add(word);
                }
                sortWord.put(firstLetter, wordJ);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "k":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordK.add(word);
                }
                sortWord.put(firstLetter, wordK);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "l":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordL.add(word);
                }
                sortWord.put(firstLetter, wordL);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "m":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordM.add(word);
                }
                sortWord.put(firstLetter, wordM);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "n":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordN.add(word);
                }
                sortWord.put(firstLetter, wordN);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "ñ":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordÑ.add(word);
                }
                sortWord.put(firstLetter, wordÑ);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "o":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordO.add(word);
                }
                sortWord.put(firstLetter, wordO);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "p":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordP.add(word);
                }
                sortWord.put(firstLetter, wordP);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "q":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordQ.add(word);
                }
                sortWord.put(firstLetter, wordQ);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "r":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordR.add(word);
                }
                sortWord.put(firstLetter, wordR);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "s":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordS.add(word);
                }
                sortWord.put(firstLetter, wordS);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "t":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordT.add(word);
                }
                sortWord.put(firstLetter, wordT);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "u":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordU.add(word);
                }
                sortWord.put(firstLetter, wordU);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "v":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordV.add(word);
                }
                sortWord.put(firstLetter, wordV);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "w":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordW.add(word);
                }
                sortWord.put(firstLetter, wordW);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "x":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordX.add(word);
                }
                System.out.println("Introduced word; " + word + ".");
            case "y":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordY.add(word);
                }
                sortWord.put(firstLetter, wordY);
                System.out.println("Introduced word; " + word + ".");
                break;
            case "z":
                if (word.isEmpty()) {
                    System.out.println("You dont introduced nothing");
                } else {
                    wordZ.add(word);
                }
                sortWord.put(firstLetter, wordZ);
                System.out.println("Introduced word; " + word + ".");
                break;
            default:
                System.out.println("you introduced a wrong word");
                break;
        }
    }

    public static void eraseWord() {
        final Scanner SCANNER = new Scanner(System.in);
        System.out.println("¿What word do you want to delete?");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
                }
                break;
            case "l":
                if (sortWord.containsKey(firstLetter)) {
                    for (String string : wordL) {
                        if (string.equals(eraseWord)) {
                            wordL.remove(eraseWord);
                        }
                    }
                    System.out.println(sortWord);
                } else {
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
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
                    System.out.println("There arent words by this initial.");
                }
                break;
            default:
                System.out.println("You dindt introduced an allowed word");
                break;
        }
    }

    public static void findWord() {
        final Scanner SCANNER = new Scanner(System.in);
        System.out.println("word that you want to find it");
        String word = SCANNER.nextLine().toLowerCase().trim();
        char firstCharacter = word.charAt(0);
        String firstLetter = Character.toString(firstCharacter);
        switch (firstLetter) {
            case "a":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordA) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "b":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordB) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "c":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordC) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "d":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordD) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "e":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordE) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "f":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordF) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "g":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordG) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "h":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordH) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "i":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordI) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "j":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordJ) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "k":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordK) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "l":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordL) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "m":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordM) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "n":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordN) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "ñ":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordÑ) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "o":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordO) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "p":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordP) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "q":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordQ) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "r":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordR) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "s":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordS) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "t":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordT) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "u":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordU) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "v":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordV) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "w":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordW) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "x":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordX) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
            case "y":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordY) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            case "z":
                if (word.isEmpty()) {
                    System.out.println("you dont introduced nothing");
                } else {
                    for (String string : wordZ) {
                        if (word.equals(string)) {
                            System.out.println("Word was found it successfully: " + word);
                        } else {
                            System.out.println("the word doesnt exist");
                        }
                    }
                }
                break;
            default:
                System.out.println("you didnt introduced a valid word.");
                break;
        }
    }

    public static void showInitials() {
        if (wordA.isEmpty() && wordB.isEmpty() && wordC.isEmpty() && wordD.isEmpty() && wordE.isEmpty()
                && wordF.isEmpty() && wordG.isEmpty() && wordH.isEmpty() && wordI.isEmpty()
                && wordJ.isEmpty() && wordK.isEmpty() && wordM.isEmpty() && wordN.isEmpty() && wordO.isEmpty()
                && wordP.isEmpty() && wordQ.isEmpty() && wordR.isEmpty() &&
                wordS.isEmpty() && wordT.isEmpty() && wordU.isEmpty() && wordV.isEmpty() && wordW.isEmpty()
                && wordX.isEmpty() && wordY.isEmpty() && wordZ.isEmpty()) {
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
            sortWord.remove("l");
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
            System.out.println("any initial letter have storaged any word");

        } else {
            System.out.println("All inital letters that keep saving words;");
            if (sortWord.get("a") == null) {
                sortWord.remove("a");
            } else {
                if (sortWord.containsKey("a") && wordA.isEmpty()) {

                } else {
                    System.out.println("The initial" + "'a'" + " have saved words.");
                }
            }

            if (sortWord.get("b") == null) {
                sortWord.remove("b");
            } else {
                if (sortWord.containsKey("b") && wordB.isEmpty()) {

                } else {
                    System.out.println("The initial" + "'b'" + " have saved words.");
                }
            }

            if (sortWord.get("c") == null) {
                sortWord.remove("c");
            } else {
                if (sortWord.containsKey("c") && wordC.isEmpty()) {

                } else {
                    System.out.println("The initial" + "'c'" + " have saved words.");
                }
            }
            if (sortWord.get("d") == null) {
                sortWord.remove("d");
            } else {
                if (sortWord.containsKey("d") && wordD.isEmpty()) {

                } else {
                    System.out.println("The initial" + "'d'" + " have saved words.");
                }
            }
            if (sortWord.get("e") == null) {
                sortWord.remove("e");
            } else {
                if (sortWord.containsKey("e") && wordE.isEmpty()) {

                } else {
                    System.out.println("The initial" + "'e'" + " have saved words.");
                }
            }
            if (sortWord.get("f") == null) {
                sortWord.remove("f");
            } else {
                if (sortWord.containsKey("f") && wordF.isEmpty()) {
                } else {
                    System.out.println("The initial" + "'f'" + " have saved words.");
                }
            }
            if (sortWord.get("g") == null) {
                sortWord.remove("g");
            } else {
                if (sortWord.containsKey("g") && wordG.isEmpty()) {
                } else {
                    System.out.println("The initial" + "'g'" + " have saved words.");
                }
            }
            if (sortWord.get("h") == null) {
                sortWord.remove("h");
            } else {
                if (sortWord.containsKey("h") && wordH.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("The initial" + "'h'" + " have saved words.");
                }
            }
            if (sortWord.get("i") == null) {
                sortWord.remove("i");
            } else {
                if (sortWord.containsKey("i") && wordI.isEmpty()) {
                } else {
                    System.out.println("The initial" + "'i'" + " have saved words.");
                }
            }
            if (sortWord.get("j") == null) {
                sortWord.remove("j");
            } else {
                if (sortWord.containsKey("j") && wordJ.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("The initial" + "'j'" + " have saved words.");
                }
            }
            if (sortWord.get("k") == null) {
                sortWord.remove("k");
            } else {
                if (sortWord.containsKey("k") && wordK.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("The initial" + "'k'" + " have saved words.");
                }
            }
            if (sortWord.get("l") == null) {
                sortWord.remove("l");
            } else {
                if (sortWord.containsKey("l") && wordL.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("The initial" + "'l'" + " have saved words.");
                }
            }
            if (sortWord.get("m") == null) {
                sortWord.remove("m");
            } else {
                if (sortWord.containsKey("m") && wordM.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("The initial" + "'m'" + " have saved words.");
                }
            }
            if (sortWord.get("n") == null) {
                sortWord.remove("n");
            } else {
                if (sortWord.containsKey("n") && wordN.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("The initial" + "'n'" + " have saved words.");
                }
            }
            if (sortWord.get("ñ") == null) {
                sortWord.remove("ñ");
            } else {
                if (sortWord.containsKey("ñ") && wordÑ.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("The initial" + "'ñ'" + " have saved words.");
                }
            }
            if (sortWord.get("o") == null) {
                sortWord.remove("o");
            } else {
                if (sortWord.containsKey("o") && wordO.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("The initial" + "'o'" + " have saved words.");
                }
            }
            if (sortWord.get("p") == null) {
                sortWord.remove("p");
            } else {
                if (sortWord.containsKey("p") && wordP.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("The initial" + "'p'" + " have saved words.");
                }
            }
            if (sortWord.get("q") == null) {
                sortWord.remove("q");
            } else {
                if (sortWord.containsKey("q") && wordQ.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("The initial" + "'q'" + " have saved words.");
                }
            }
            if (sortWord.get("r") == null) {
                sortWord.remove("r");
            } else {
                if (sortWord.containsKey("r") && wordR.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("The initial" + "'r'" + " have saved words.");
                }
            }
            if (sortWord.get("s") == null) {
                sortWord.remove("s");
            } else {
                if (sortWord.containsKey("s") && wordS.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("The initial" + "'s'" + " have saved words.");
                }
            }
            if (sortWord.get("t") == null) {
                sortWord.remove("t");
            } else {
                if (sortWord.containsKey("t") && wordT.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("The initial" + "'t'" + " have saved words.");
                }
            }
            if (sortWord.get("u") == null) {
                sortWord.remove("u");
            } else {
                if (sortWord.containsKey("u") && wordU.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("The initial" + "'u'" + " have saved words.");
                }
            }
            if (sortWord.get("v") == null) {
                sortWord.remove("v");
            } else {
                if (sortWord.containsKey("v") && wordV.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("The initial" + "'v'" + " have saved words.");
                }
            }
            if (sortWord.get("w") == null) {
                sortWord.remove("w");
            } else {
                if (sortWord.containsKey("w") && wordW.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("The initial" + "'w'" + " have saved words.");
                }
            }
            if (sortWord.get("x") == null) {
                sortWord.remove("x");
            } else {
                if (sortWord.containsKey("x") && wordX.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("The initial" + "'x'" + " have saved words.");
                }
            }
            if (sortWord.get("y") == null) {
                sortWord.remove("y");
            } else {
                if (sortWord.containsKey("y") && wordY.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("The initial" + "'y'" + " have saved words.");
                }
            }
            if (sortWord.get("z") == null) {
                sortWord.remove("z");
            } else {
                if (sortWord.containsKey("z") && wordZ.isEmpty()) {
                    System.out.println("");
                } else {
                    System.out.println("The initial" + "'z'" + " have saved words.");
                }
            }

        }
    }

    public static void wordsByInitials() {
        final Scanner SCANNER = new Scanner(System.in);
        System.out.println("Give me the initial word that you want to show me all the words that it has");
        String letter = SCANNER.nextLine().toLowerCase();
        if (letter.length() == 1) {
            if (letter.isEmpty()) {
                System.out.println("you dont writed any initial letter");
            } else {
                switch (letter) {
                    case "a":

                        if (wordA.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter a");
                        } else {
                            System.out.println(wordA);
                        }
                        break;
                    case "b":

                        if (wordB.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter b");
                        } else {
                            System.out.println(wordB);
                        }
                        break;
                    case "c":

                        if (wordC.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter c");
                        } else {
                            System.out.println(wordC);
                        }
                        break;
                    case "d":

                        if (wordD.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter d");
                        } else {
                            System.out.println(wordD);
                        }
                        break;
                    case "e":

                        if (wordE.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter e");
                        } else {
                            System.out.println(wordE);
                        }
                        break;
                    case "f":

                        if (wordF.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter f");
                        } else {
                            System.out.println(wordF);
                        }
                        break;
                    case "g":

                        if (wordG.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter g");
                        } else {
                            System.out.println(wordG);
                        }
                        break;
                    case "h":
                        if (wordH.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter h");
                        } else {
                            System.out.println(wordH);
                        }
                        break;
                    case "i":

                        if (wordI.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter i");
                        } else {
                            System.out.println(wordI);
                        }
                        break;
                    case "j":

                        if (wordJ.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter j");
                        } else {
                            System.out.println(wordJ);
                        }
                        break;
                    case "k":

                        if (wordK.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter k");
                        } else {
                            System.out.println(wordK);
                        }
                        break;
                    case "l":

                        if (wordL.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter l");
                        } else {
                            System.out.println(wordL);
                        }
                        break;
                    case "m":

                        if (wordM.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter m");
                        } else {
                            System.out.println(wordM);
                        }
                        break;
                    case "n":

                        if (wordN.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter n");
                        } else {
                            System.out.println(wordN);
                        }
                        break;
                    case "ñ":

                        if (wordÑ.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter ñ");
                        } else {
                            System.out.println(wordÑ);
                        }
                        break;
                    case "o":

                        if (wordO.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter o");
                        } else {
                            System.out.println(wordO);
                        }
                        break;
                    case "p":

                        if (wordP.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter p");
                        } else {
                            System.out.println(wordP);
                        }
                        break;
                    case "q":

                        if (wordQ.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter q");
                        } else {
                            System.out.println(wordQ);
                        }
                        break;
                    case "r":

                        if (wordR.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter r");
                        } else {
                            System.out.println(wordR);
                        }
                        break;
                    case "s":

                        if (wordS.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter s");
                        } else {
                            System.out.println(wordS);
                        }
                        break;
                    case "t":

                        if (wordT.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter t");
                        } else {
                            System.out.println(wordT);
                        }
                        break;
                    case "u":

                        if (wordU.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter u");
                        } else {
                            System.out.println(wordU);
                        }
                        break;
                    case "v":

                        if (wordV.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter v");
                        } else {
                            System.out.println(wordV);
                        }
                        break;
                    case "w":

                        if (wordW.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter w");
                        } else {
                            System.out.println(wordW);
                        }
                        break;
                    case "x":

                        if (wordX.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter x");
                        } else {
                            System.out.println(wordX);
                        }
                        break;
                    case "y":

                        if (wordY.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter y");
                        } else {
                            System.out.println(wordY);
                        }
                        break;
                    case "z":

                        if (wordA.isEmpty()) {
                            System.out.println("It dont exist anything saved with the letter z");
                        } else {
                            System.out.println(wordZ);
                        }
                        break;

                    default:
                        System.out.println("You dont introduced a valid initial");
                        break;
                }
            }

        } else {
            System.out.println("You exceeded the amount of characters for putting a initial.");
        }
    }
}
