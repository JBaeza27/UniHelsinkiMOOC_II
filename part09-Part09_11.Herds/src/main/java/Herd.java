
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sierra02
 */
public class Herd implements Movable {
    private ArrayList<Movable> herd;
    
    public Herd(){
        this.herd = new ArrayList<>();
    }
    public void addToHerd(Movable movable){
        herd.add(movable);
    }
    
    public void move(int dx, int dy){
        for(Movable item: herd){
            item.move(dx, dy);
        }
    }
    
    // Since we need to have a new line for each item, we have to make sure it 
    // has the toString of the Movable item and then a new line. Otherwise it would
    // just print the whole arraylist.
    
    @Override
    public String toString() {
        String list = "";
        
        for(Movable item: herd){
            list += item.toString() + "\n";
        }
        return list;
    }
    
}
