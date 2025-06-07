
import java.util.ArrayList;
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
public class VehicleRegistry {

    private HashMap<LicensePlate, String> ownership;

    public VehicleRegistry() {
        this.ownership = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {

        if (ownership.containsKey(licensePlate)) {

            return false;
        }
        ownership.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {

        return ownership.getOrDefault(licensePlate, null);

    }

    public boolean remove(LicensePlate licensePlate) {
        if (ownership.containsKey(licensePlate)) {
            ownership.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : ownership.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();

        for (String owner : ownership.values()) {
            if (owners.contains(owner)) {
                continue;
            }
            System.out.println(owner);
            owners.add(owner);
        }
    }
}
