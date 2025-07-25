/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sierra02
 */
public class CD implements Packable {
    private String name;
    private String artist;
    private int publicationyear;
    
            
    public CD(String artist,String name, int publicationyear){
        this.artist = artist;
        this.name = name;
        this.publicationyear = publicationyear;
    }
    public double weight(){
        return 0.1;
    }

    @Override
    public String toString() {
        return   artist + ": " + name + " (" + publicationyear + ")";
    }
    
}
