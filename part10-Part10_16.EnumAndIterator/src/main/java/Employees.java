
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sierra02
 */
public class Employees {

    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        for (Person person : peopleToAdd) {
            this.employees.add(person);
        }
    }

    public void print() {

        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person nextLine = iterator.next();
            System.out.println(nextLine);
        }

//        for (Person person : this.employees) {
//            System.out.println(person);
//        }
    }

    public void print(Education education) {

//        this.employees.stream().forEach(person -> {
//            if (person.getEducation().equals(education)) {
//                System.out.println(person);
//            }
//        });

        Iterator<Person> iterator = this.employees.iterator();
        
        while(iterator.hasNext()){
            Person nextLine = iterator.next();
            if(nextLine.getEducation().equals(education)){
                System.out.println(nextLine);
            }         
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person nextLine = iterator.next();
            if (nextLine.getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
