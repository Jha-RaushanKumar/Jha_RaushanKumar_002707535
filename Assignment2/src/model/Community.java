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
    
    public Community(){
        house = new ArrayList<>();
    }
    public void addHouse(House h ){
        house.add(h);
    }

    public ArrayList<House> getHouse() {
        return house;
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
    
    
    
}
