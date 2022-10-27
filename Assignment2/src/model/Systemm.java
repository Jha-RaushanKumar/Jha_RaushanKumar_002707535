/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Raushan
 */
public class Systemm {
    
    private PatientDirectory listPatient;
    private PersonDirectory listPerson;
    private City city;
    
    public Systemm(){
        listPerson  = new PersonDirectory();
        listPatient = new PatientDirectory();
        
    }

    public PatientDirectory getListPatient() {
        return listPatient;
    }

    public void setListPatient(PatientDirectory listPatient) {
        this.listPatient = listPatient;
    }

    public PersonDirectory getListPerson() {
        return listPerson;
    }

    public void setListPerson(PersonDirectory listPerson) {
        this.listPerson = listPerson;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    public void addPerson(Person p){
        listPerson.addPerson(p);
    }

    public void addPatient(Patient patient){
        listPatient.addPatients(patient);
    }
    
}
