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
public class EmployeeList {
    
    private ArrayList<Employee> list_emp;
    
    public EmployeeList(){
        list_emp = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getList_emp() {
        return list_emp;
    }

    public void setList_emp(ArrayList<Employee> list_emp) {
        this.list_emp = list_emp;
    }
    
    public Employee addEmployee(){
        
        Employee emp = new Employee();
        list_emp.add(emp);
        return emp;
    }
    
    public void deleteEmployee(String name){
        
        for (Employee emp : list_emp) {
 
            if (emp.getName() == name) {
                list_emp.remove(emp);
                break;
            }
        }
    }
    
    
}
