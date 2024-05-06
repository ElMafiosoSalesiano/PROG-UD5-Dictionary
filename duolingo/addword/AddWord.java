package duolingo.addword;

import java.util.HashSet;
import java.util.Set;

public class AddWord {
    private static Set<String> wordAdded = new HashSet<>();
    
    private static void wordAdd(String word){
        word.toLowerCase();
        if (word.isEmpty()) {
            System.out.println("No introdujo nada");
        }
        else{
            wordAdded.add(word);
        }
    }

    private static String[] wordCatch(){
        String[] arrayWords = new String[wordAdded.size()];
        arrayWords = wordAdded.toArray(arrayWords);
        return arrayWords;
    }
}
