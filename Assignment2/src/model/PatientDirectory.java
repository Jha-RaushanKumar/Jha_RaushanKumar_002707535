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
    }

    public void addPatients(Patient patient) {
        patients.add(patient);
    }
    public void addPatient(String name, House residence, String gender, String dob, int id, Encounter encounter) {

        Patient patient = new Patient(name, residence, gender,dob,id,encounter);

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
