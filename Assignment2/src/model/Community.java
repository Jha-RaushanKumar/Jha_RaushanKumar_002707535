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
    
    private String community;
    private ArrayList<House> house;
    
    public Community(String community){
        this.community = community;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public ArrayList<House> getHouse() {
        return house;
    }

    public void setHouse(ArrayList<House> house) {
        this.house = house;
    }
    
    
    
}