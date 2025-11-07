/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Sierra02
 */
public class TemperatureSensor implements Sensor {
    private int integer;
    private boolean setting;
    
    public TemperatureSensor(){
        this.integer = integer;
    }
    
    public boolean isOn(){
        return this.setting;
    } 
    
    public void setOn(){
        this.setting = true;
    }
    public void setOff(){
        this.setting = false;
    }
   
    
   public int read(){
       
       if(isOn() && this.setting){
            return this.integer = new Random().nextInt(61) - 30;
       }else{
           throw new IllegalStateException();
       }
   }
    
}
