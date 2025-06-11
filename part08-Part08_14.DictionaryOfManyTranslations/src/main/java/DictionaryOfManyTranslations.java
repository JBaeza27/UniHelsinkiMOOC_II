
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sierra02
 */
public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> translation;

    public DictionaryOfManyTranslations() {
        this.translation = new HashMap<>();
    }

    public void add(String word, String translation) {
        // Create an empty list when there isn't a translation yet
        this.translation.putIfAbsent(word, new ArrayList<>());

        ArrayList<String> completeTranslation = this.translation.get(word);
        // Add another translation to the ArrayList
        completeTranslation.add(translation);
    }

    public ArrayList<String> translate(String word) {
        return this.translation.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        this.translation.remove(word);
    }
}
