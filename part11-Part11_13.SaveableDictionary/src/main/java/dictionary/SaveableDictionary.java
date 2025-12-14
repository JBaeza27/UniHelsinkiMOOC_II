/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Sierra02
 */
public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private File file;
    
    
    
    // Don't forget to create it
    public SaveableDictionary() {
        this.dictionary = new HashMap();
    }

    public SaveableDictionary(String file){
        this.dictionary = new HashMap();
        this.file = new File(file);
    }
    
    public boolean load(){
        try{
            Scanner reader = new Scanner(Paths.get(this.file.getName()));
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String[] parts = line.split(":");
                this.dictionary.putIfAbsent(parts[0], parts[1]);
            }
            return true;
        } catch(Exception e){
            System.out.println("Error loading");
            return false;
        }
    }
    
    
    public boolean save(){
        try{
            PrintWriter printwriter = new PrintWriter(this.file.getName());
            for(String key: this.dictionary.keySet()){
                String word = key;
                String translation = this.dictionary.get(word);
                printwriter.println(key + ":" + translation);
            }
            printwriter.close();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    
    
    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
    }

    public String translate(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        }
        // Remeber .equals for strings
        for (String key : this.dictionary.keySet()) {
            if (this.dictionary.get(key).equals(word)) {
                return key;
            }
        }
        return null;
    }

    public void delete(String word) {

    
        if (this.dictionary.containsKey(word)) {
            // Removes the key not the value
            this.dictionary.remove(word);
            return;
        }
        
        String remove = null;

        
        for (String key : this.dictionary.keySet()) {
            //if the value is equal to the word, we can delete the key which deletes the value.
            if (this.dictionary.get(key).equals(word)) {
                remove = key;
                break;
            }
        }
        if(remove != null){
            this.dictionary.remove(remove);
        }

    }
}
