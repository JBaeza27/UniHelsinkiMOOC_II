
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
public class Box implements Packable {

    private double capacity;
    private ArrayList<Packable> items;
    
    
    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
      
        if (this.weight() + item.weight() <= this.capacity) {
           this.items.add(item);
           // Take out the capacity left
           
        }
    }

    public double weight() {
        double weight = 0;
        // the item weight is referencing any class that has the inferace implemented!
        // So The CD weight would return 0.1 and Book would return the book weight!
        for(Packable item: items){
            weight += item.weight();
        }
        
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, " + "total weight " + this.weight() + " kg";
    }
    
}
