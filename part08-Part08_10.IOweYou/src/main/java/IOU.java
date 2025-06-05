
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
public class IOU {

    private HashMap<String, Double> debtCounter;
    
    public IOU(){
        this.debtCounter = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        double balance = this.debtCounter.getOrDefault(toWhom, 0.0);
        balance += amount;
        this.debtCounter.put(toWhom, balance);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        return this.debtCounter.getOrDefault(toWhom, 0.0);
    }
    
}
