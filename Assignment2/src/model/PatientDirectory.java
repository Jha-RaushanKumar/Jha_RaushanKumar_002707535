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
public class PatientDirectory {
    
    private ArrayList<Patient> patients;
    
    public PatientDirectory() {
        patients = new ArrayList<>();
        //addPatient();
    }
    /*public void addPatient() {
        Person p1 = new Person("Raushan",new House("75Aplhonsus",new City("Boston"),"MA",021200,new Community("Roxbury")),"Male","11/29/1997",1);
        Person p2 = new Person("Gaurav",new House("75Aplhonsus",new City("Boston"),"MA",021200,new Community("Roxbury")),"Male","11/29/1997",2);
        Person p3 = new Person("Rohit",new House("75Aplhonsus",new City("Boston"),"MA",021200,new Community("Roxbury")),"Male","11/29/1997",3);
        Person p4 = new Person("Vishal",new House("75Aplhonsus",new City("Boston"),"MA",021200,new Community("Roxbury")),"Male","11/29/1997",4);
        addPatients(p1);
        addPatients(p2);
        addPatients(p3);
        addPatients(p4);

        
    }*/

    public void addPatients(Patient patient) {
        patients.add(patient);
    }
    public void addPatient(String name, House residence, String gender, String dob, int id, Encounter encounter, int patientId) {

        Patient patient = new Patient(name, residence, gender,dob,id,encounter,patientId);

        patients.add(patient);
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
    
    public Patient getPatient(String name){
        
        for (Patient emp : patients) {
 
            if (emp.getName() == name) {
                return emp;
            }
        }
        return null;
    }
    
    
}
