/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Raushan
 */
public class Doctor extends Person{

    private int docId;
    
    public Doctor(String name, int id, House residence, String gender, Date dob, int docId) {
        super(name, residence, gender, txtDate.getText(), dob);
        
        this.docId = docId;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }
    
}
