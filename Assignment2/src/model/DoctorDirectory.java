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
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctors;
        Doctor p1 = new Doctor("Raushbban",new House("75Aplhonsus",new City("Boston"),"MA",021200,"ParkerStreet"),"Male","11/29/1997",1,102);
        Doctor p2 = new Doctor("Gaubbrav",new House("75Aplhosus",new City("Boston"),"MA",021200,"Roxbury"),"Male","11/29/1997",2,102);
        Doctor p3 = new Doctor("Rohibbt",new House("75Aplhous",new City("Boston"),"MA",021200,"Northeastern"),"Male","11/29/1997",3,103);
        Doctor p4 = new Doctor("Visbbhal",new House("75Aplhosus",new City("Boston"),"MA",021200,"Downtown"),"Male","11/29/1997",4,104);
        Doctor p5 = new Doctor("Risbbhabh",new House("75Aplhonsus",new City("Boston"),"MA",021200,"ParkerStreett"),"Male","11/29/1997",5,105);
        Doctor p6 = new Doctor("Himbbanshu",new House("75Apnsus",new City("Boston"),"MA",021200,"Roxburyy"),"Male","11/29/1997",6,106);
        Doctor p7 = new Doctor("Harbbshit",new House("75Aplonsus",new City("Boston"),"MA",021200,"Northeasternn"),"Male","11/29/1997",7,107);
        Doctor p8 = new Doctor("Jyobbtii",new House("75honsus",new City("Boston"),"MA",021200,"Downtownn"),"Male","11/29/1997",8,108);
        
    public DoctorDirectory() {
        doctors = new ArrayList<>();
        addDoctors();
    }
    
    public void addDoctors(){
        addDoctor(p1);
        addDoctor(p2);
        addDoctor(p3);
        addDoctor(p4);
        addDoctor(p5);
        addDoctor(p6);
        addDoctor(p7);
        addDoctor(p8);
    }

    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }
    public void addDoctor(String name, House residence, String gender, String dob, int id, int patientId) {

        Doctor doctor = new Doctor(name, residence, gender,dob,id,patientId);

        doctors.add(doctor);
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }
    public Doctor getDoctor(String name){
        
        for (Doctor emp : doctors) {
 
            if (emp.getName() == name) {
                return emp;
            }
        }
        return null;
    }
    
    public void deleteDoctor(String name){
        
        for (Doctor emp : doctors) {
 
            if (emp.getName() == name) {
                doctors.remove(emp);
                break;
            }
            else if(emp.getDocId() == Integer.parseInt(name)){
                doctors.remove(emp);
                break;
            }
        }
    }
    
    public DoctorDirectory idFilter(int eId) {

        DoctorDirectory list = new DoctorDirectory();
        for (Doctor emp : doctors) {
            if (emp.getDocId() == eId) {
                list.addDoctor(emp);
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
    
    public DoctorDirectory commFilter(String comm) {

        DoctorDirectory list = new DoctorDirectory();
        for (Doctor emp : doctors) {
            if (emp.getResidence().getCommunity().equals(comm)) {
                list.addDoctor(emp);
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
    
    private void remove(Doctor p1) {
        for (Doctor emp : doctors) {
 
            if (emp.getDocId() == p1.getDocId()) {
                doctors.remove(emp);
                break;
            }
        }
    }
    
    
}
