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
public class HospitalDirectory {
    
    private ArrayList<Hospital> hospitals;
Hospital p1 = new Hospital("Hospital1","ParkerStreet");
        Hospital p2 = new Hospital("Hospital2","Roxbury");
        Hospital p3 = new Hospital("Hospital3","Northeastern");
        Hospital p4 = new Hospital("Hospital4","Downtown");
        Hospital p5 = new Hospital("Hospital5","ParkerStreett");
        Hospital p6 = new Hospital("Hospital6","Roxburyy");
        Hospital p7 = new Hospital("Hospital7","Northeasternn");
        Hospital p8 = new Hospital("Hospital18","Downtownn");
        
    public HospitalDirectory() {
        hospitals = new ArrayList<>();
        addHospitals();
    }
    
    public void addHospitals(){
        addHospital(p1);
        addHospital(p2);
        addHospital(p3);
        addHospital(p4);
        addHospital(p5);
        addHospital(p6);
        addHospital(p7);
        addHospital(p8);
    }

    public void addHospital(Hospital hospital){
        hospitals.add(hospital);
    }

    public ArrayList<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(ArrayList<Hospital> hospitals) {
        this.hospitals = hospitals;
    }
    public Hospital getHospitals(String name){
        
        for (Hospital emp : hospitals) {
 
            if (emp.getCommunity() == name) {
                return emp;
            }
        }
        return null;
    }
    
    public HospitalDirectory commHosFilter(String name) {

        HospitalDirectory list = new HospitalDirectory();
        for (Hospital emp : hospitals) {
            if (emp.getCommunity().equals(name)) {
                list.addHospital(emp);
            }
            
        }
        list.remove(p1);
        list.remove(p2);
        list.remove(p3);
        list.remove(p4);
        list.remove(p5);
        list.remove(p6);
        list.remove(p7);
        list.remove(p8);
        return list;
    }
    public void deleteHospital(String name){
        
        for (Hospital emp : hospitals) {
 
            if (emp.getCommunity() == name) {
                hospitals.remove(emp);
                break;
            }
        }
    }

    private void remove(Hospital p1) {
        for (Hospital emp : hospitals) {
 
            if (emp.getHospitalName() == p1.getHospitalName()) {
                hospitals.remove(emp);
                break;
            }
        }
    }
    
}
