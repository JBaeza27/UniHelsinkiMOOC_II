
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
public class ChangeHistory{

    private ArrayList<Double> storage;

    public ChangeHistory() {
        this.storage = new ArrayList<Double>();
    }

    public void add(double status) {
        this.storage.add(status);
    }

    public void clear() {
        this.storage.clear();
    }

    public double maxValue() {
          if(this.storage.isEmpty()){
            return 0;
        }
        Double max = this.storage.get(0);
        for (Double item : this.storage) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    public double minValue() {
        if(this.storage.isEmpty()){
            return 0;
        }
        Double min = this.storage.get(0);
        for (Double item : this.storage) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }

    public double average() {
        if(this.storage.isEmpty()){
            return 0;
        }
        Double counter = 0.0;
        Double total = 0.0;
        for (Double item : this.storage) {
           counter++;
           total += item;
        }
        return total / counter;
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
