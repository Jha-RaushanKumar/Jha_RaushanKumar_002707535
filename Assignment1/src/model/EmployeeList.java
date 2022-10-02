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
    
    public Employee getEmployee(String name){
        
        for (Employee emp : list_emp) {
 
            if (emp.getName() == name) {
                return emp;
            }
        }
        return null;
    }
    
    public void deleteEmployee(String name){
        
        for (Employee emp : list_emp) {
 
            if (emp.getName() == name) {
                list_emp.remove(emp);
                break;
            }
        }
    }
    
    public ArrayList<Employee> nameFilter(String name) {

        ArrayList<Employee> list = new ArrayList<>();
        for (Employee emp : list_emp) {
            if (emp.getName().matches(name)) {
                list.add(emp);
            }
        }
        return list;
    }
    
    public ArrayList<Employee> teamInfoFilter(String team) {

        ArrayList<Employee> list = new ArrayList<>();
        for (Employee emp : list_emp) {
            if (emp.getTeamInfo().matches(team)) {
                list.add(emp);
            }
        }
        return list;
    }
    
    public ArrayList<Employee> positionFilter(String position) {

        ArrayList<Employee> list = new ArrayList<>();
        for (Employee emp : list_emp) {
            if (emp.getPositionTitle().matches(position)) {
                list.add(emp);
            }
        }
        return list;
    }
    public ArrayList<Employee> levelFilter(String level) {

        ArrayList<Employee> list = new ArrayList<>();
        for (Employee emp : list_emp) {
            if (emp.getLevel().matches(level)) {
                list.add(emp);
            }
        }
        return list;
    }
    
    public ArrayList<Employee> empIdFilter(int eId) {

        ArrayList<Employee> list = new ArrayList<>();
        for (Employee emp : list_emp) {
            if (emp.getEmpId() == eId) {
                list.add(emp);
            }
        }
        return list;
    }
    
    
    
}
