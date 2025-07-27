
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sierra02
 */
public class Warehouse {

    private Map<String, Integer> storage; // price
    private Map<String, Integer> quantities;// stock

    public Warehouse() {
        this.storage = new HashMap<>();
        this.quantities = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        storage.put(product, price);
        quantities.put(product, stock);
    }
    
    public Set<String> products(){
        return storage.keySet();
    }

    public boolean take(String product) {
        if (quantities.containsKey(product)) {
            int total = quantities.get(product);

            if (total >= 1) {
                quantities.put(product, total - 1);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public int stock(String product) {
        if (!quantities.containsKey(product)) {
            quantities.put(product, 0);
        }
        return quantities.get(product);
    }

    public int price(String product) {

        if (!storage.containsKey(product)) {
            storage.put(product, -99);
        }

        return storage.get(product);

    }

}
