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
public class PatientDirectory {
    
    private ArrayList<Patient> patients;
    Date resultdate = new Date(System.currentTimeMillis());
        Patient p1 = new Patient("Raushannn",new House("75Aplhonsus",new City("Boston"),"MA",021200,"Parker Street"),"Male","11/29/1997",1,new Encounter(new VitalSigns(10,20,30),null,"Septicemia"),21);
        Patient p2 = new Patient("Gauravnn",new House("75Aplhonsus",new City("Boston"),"MA",021200,"Roxbury"),"Male","11/29/1997",2,new Encounter(new VitalSigns(11,21,31),null,"Diabetes"),22);
        Patient p3 = new Patient("Rohitnn",new House("75Aplhonsus",new City("Boston"),"MA",021200,"Northeastern"),"Male","11/29/1997",3,new Encounter(new VitalSigns(12,22,32),null,"Obesity"),13);
        Patient p4 = new Patient("Rishabhnn",new House("75Aplhonsus",new City("Boston"),"MA",021200,"Parker Street"),"Male","11/29/1997",4,new Encounter(new VitalSigns(0,0,0),null,null),14);
        Patient p5 = new Patient("Jyotinn",new House("75Aplhonsus",new City("Boston"),"MA",021200,"Roxbury"),"Male","11/29/1997",5,new Encounter(new VitalSigns(0,0,0),null,null),15);
        Patient p6 = new Patient("Harshitnn",new House("75Aplhonsus",new City("Boston"),"MA",021200,"Northeastern"),"Male","11/29/1997",6,new Encounter(new VitalSigns(0,0,0),null,null),16);
        
    public PatientDirectory() {
        patients = new ArrayList<>();
        addPatient();
    }
    public void addPatient() {
        addPatients(p1);
        addPatients(p2);
        addPatients(p3);
        addPatients(p4);
        addPatients(p5);
        addPatients(p6);
    }

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
    
    public void deletePatient(String name){
        
        for (Patient emp : patients) {
 
            if (emp.getName() == name) {
                patients.remove(emp);
                break;
            }
            else if(emp.getPatientId() == Integer.parseInt(name)){
                patients.remove(emp);
                break;
            }
        }
    }
    
    public PatientDirectory idFilter(int eId) {

        PatientDirectory list = new PatientDirectory();
        for (Patient emp : patients) {
            if (emp.getPatientId() == eId) {
                list.addPatients(emp);
            }
        }
        list.remove(p1);
        list.remove(p2);
        list.remove(p3);
        list.remove(p4);
        list.remove(p5);
        list.remove(p6);
        return list;
    }
    
    private void remove(Patient p1) {
        for (Patient emp : patients) {
 
            if (emp.getPatientId() == p1.getPatientId()) {
                patients.remove(emp);
                break;
            }
        }
    }
    
    
}
