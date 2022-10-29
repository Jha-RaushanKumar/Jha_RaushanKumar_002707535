/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Raushan
 */
public class Community {
    
    private ArrayList<House> house;
    House p1 = new House("75Aplhonsus",new City("Boston"),"MA",021200,"ParkerStreet");
        House p2 = new House("75Aplhosus",new City("Boston"),"MA",021200,"Roxbury");
        House p3 = new House("75Aplhous",new City("Boston"),"MA",021200,"Northeastern");
        House p4 = new House("75Aplhosus",new City("Boston"),"MA",021200,"Downtown");
        House p5 = new House("75Aplhonsus",new City("Boston"),"MA",021200,"ParkerStreet");
        House p6 = new House("75Apnsus",new City("Boston"),"MA",021200,"Roxbury");
        House p7 = new House("75Aplonsus",new City("Boston"),"MA",021200,"Northeastern");
        
    public Community(){
        house = new ArrayList<>();
        addHouses();
    }
    public void addHouse(House h ){
        house.add(h);
    }

    public ArrayList<House> getHouse() {
        return house;
        
    }
    public void addHouses() {
        addHouse(p1);
        addHouse(p2);
        addHouse(p3);
        addHouse(p4);
        addHouse(p5);
        addHouse(p6);
        addHouse(p7);
    }
    public House getHouses(String name){
        
        for (House emp : house) {
 
            if (emp.getCommunity() == name) {
                return emp;
            }
        }
        return null;
    }

    public void setHouse(ArrayList<House> house) {
        this.house = house;
    }
    
    public Community commFilter(String name) {

        Community list = new Community();
        for (House emp : house) {
            if (emp.getCommunity().equals(name)) {
                list.addHouse(emp);
            }
        }
        list.remove(p1);
        list.remove(p2);
        list.remove(p3);
        list.remove(p4);
        list.remove(p5);
        list.remove(p6);
        list.remove(p7);
        return list;
    }
    public void deleteHouse(String name){
        
        for (House emp : house) {
 
            if (emp.getCommunity() == name) {
                house.remove(emp);
                break;
            }
        }
    }
    
    private void remove(House p1) {
        for (House emp : house) {
 
            if (emp.getCommunity() == p1.getCommunity()) {
                house.remove(emp);
                break;
            }
        }
    }
    
    
    
}
