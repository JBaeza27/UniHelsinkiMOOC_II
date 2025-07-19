
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
public class OneItemBox extends Box {

    private Item item;

    //Can have a constructor with nothing inside
    public OneItemBox() {

    }

    // Since it is a single entity, it doesn't make sense 
    // to make an arraylist with 1 item.
    public void add(Item item) {
        if (this.item != null) {
            return;
        }
        this.item = item;
    }
    
    // Again, since it is a single item then we can use it directly instead of within a arraylist
    @Override
    public boolean isInBox(Item item) {
        return this.item != null && this.item.equals(item);
    }

//    private int capacity;
//    private ArrayList<Item> items;
//
//    public OneItemBox() {
//        this.capacity = 1;
//        this.items = new ArrayList<>();
//    }
//
//    public void add(Item item) {
//        if (this.capacity > 0) {
//            this.items.add(item);
//            capacity -= 1;
//
//        }
//    }
//
//    public boolean isInBox(Item item) {
//
//        for (Item component : items) {
//            if (component.equals(item)) {
//                return true;
//            }
//        }
//        return false;
//    }
}
