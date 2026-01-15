
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
public class Hideout<T> {

    T hideout;

    public Hideout() {
    }

    public void putIntoHideout(T toHide) {
        this.hideout = toHide;
    }

    public T takeFromHideout() {
        T value = this.hideout;
        this.hideout = null;
        return value;

    }

    public boolean isInHideout() {
        if(this.hideout != null){
            return true;
        }else{
            return false;
        }
    }
}
