
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


public class Abbreviations {
    private HashMap<String,String> abbreviations;
    
    public Abbreviations(){
        this.abbreviations = new HashMap<>();
    }
    
     public boolean hasAbbreviation(String abbreviation){
         
         if(this.abbreviations.containsKey(abbreviation)){
             return true;
         }
         return false;
     }
    
     public String findExplanationFor(String abbreviation){
         
         if(hasAbbreviation(abbreviation)){
             return this.abbreviations.get(abbreviation);
         }
         
         return null;
     }
     
    public void addAbbreviation(String abbreviation, String explanation){
        if(!hasAbbreviation(abbreviation)){
            this.abbreviations.put(abbreviation, explanation);
        }      
    }
    
    
}
