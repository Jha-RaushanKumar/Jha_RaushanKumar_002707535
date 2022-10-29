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
Person p1 = new Person("Raushan",new House("75Aplhonsus",new City("Boston"),"MA",021200,"ParkerStreet"),"Male","11/29/1997",1);
        Person p2 = new Person("Gaurav",new House("75Aplhosus",new City("Boston"),"MA",021200,"Roxbury"),"Male","11/29/1997",2);
        Person p3 = new Person("Rohit",new House("75Aplhous",new City("Boston"),"MA",021200,"Northeastern"),"Male","11/29/1997",3);
        Person p4 = new Person("Vishal",new House("75Aplhosus",new City("Boston"),"MA",021200,"Downtown"),"Male","11/29/1997",4);
        Person p5 = new Person("Rishabh",new House("75Aplhonsus",new City("Boston"),"MA",021200,"ParkerStreet"),"Male","11/29/1997",5);
        Person p6 = new Person("Himanshu",new House("75Apnsus",new City("Boston"),"MA",021200,"Roxbury"),"Male","11/29/1997",6);
        Person p7 = new Person("Harshit",new House("75Aplonsus",new City("Boston"),"MA",021200,"Northeastern"),"Male","11/29/1997",7);
        Person p8 = new Person("Jyoti",new House("75honsus",new City("Boston"),"MA",021200,"Downtown"),"Male","11/29/1997",8);
        
    public PersonDirectory() {
        persons = new ArrayList<>();
       addPersons();
    }
    
    public void addPersons() {
        addPerson(p1);
        addPerson(p2);
        addPerson(p3);
        addPerson(p4);
        addPerson(p5);
        addPerson(p6);
        addPerson(p7);
        addPerson(p8);

        /*City c1 = new City("Boston", "MA", "USA");
        City c2 = new City("New York", "NY", "USA");
        City c3 = new City("Pune", "MH", "India");
        City c4 = new City("Mumbai", "MH", "India");
        City c5 = new City("San Francisco", "CA", "USA");
        cities.add(c1);
        cities.add(c2);
        cities.add(c3);
        cities.add(c4);
        cities.add(c5);

        Community co1 = new Community("Roxbury", cities.get(0));
        Community co2 = new Community("New Jersey", cities.get(1));
        Community co3 = new Community("Kothrud", cities.get(2));
        Community co4 = new Community("Andheri", cities.get(3));
        communities.add(co1);
        communities.add(co2);
        communities.add(co3);
        communities.add(co4)*/
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
            else if(emp.getId() == Integer.parseInt(name)){
                persons.remove(emp);
                break;
            }
        }
    }
    
    public PersonDirectory idFilter(int eId) {

        PersonDirectory list = new PersonDirectory();
        for (Person emp : persons) {
            if (emp.getId() == eId) {
                list.addPerson(emp);
            }
        }
        list.remove(p1);
        list.remove(p2);
        list.remove(p3);
        list.remove(p4);
        list.remove(p5);
        list.remove(p6);
        list.remove(p7);list.remove(p8);
        
        return list;
    }
    private void remove(Person p1) {
        for (Person emp : persons) {
 
            if (emp.getId() == p1.getId()) {
                persons.remove(emp);
                break;
            }
        }
    }
    
    /*public void deletePerson(int id){
        
        for (Person emp : persons) {
 
            if (emp.getId() == id) {
                persons.remove(emp);
                break;
            }
        }
    }*/
    
    
    
    
}
