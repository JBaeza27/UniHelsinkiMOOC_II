/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sierra02
 */
public class Teacher extends Person {
    private int salary;
    
    public Teacher(String name, String address, int salary){
        super(name, address);
        this.salary = salary;     
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  " + "salary " + salary + " euro/month";
    }
    
    
    
}
