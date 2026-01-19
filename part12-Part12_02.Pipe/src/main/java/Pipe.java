
import java.util.ArrayList;
import java.util.Queue;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sierra02
 */
public class Pipe<T> {
    
    private ArrayList<T> values;

    public Pipe() {
        this.values = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        values.add(value);
    }
    public T takeFromPipe(){
        if(values.isEmpty()){
            return null;
        }
        T oldest = this.values.get(0);
        this.values.remove(0);
        return oldest;
    }
    
    public boolean isInPipe(){
        return !(values.isEmpty());
    }
    
}
