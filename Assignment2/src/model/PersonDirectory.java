/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Raushan
 */
public class PersonDirectory {
    
    private ArrayList<Person> persons;

    public PersonDirectory() {
        persons = new ArrayList<>();
    }
    public void addPerson(Person person){
        persons.add(person);
    }
    public void addPerson(String name, House residence, String gender, String dob, int id) {

        Person person = new Person(name, residence, gender,dob,id);

        persons.add(person);
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
    
    public Person getPerson(String name){
        
        for (Person emp : persons) {
 
            if (emp.getName() == name) {
                return emp;
            }
        }
        return null;
    }
    
    public void deletePerson(String name){
        
        for (Person emp : persons) {
 
            if (emp.getName() == name) {
                persons.remove(emp);
                break;
            }
        }
    }
    
    
    
}
