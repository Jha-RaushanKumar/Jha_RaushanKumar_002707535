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
    
    private ArrayList<Employee> listEmp;
    
    public EmployeeList(){
        listEmp = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getList_emp() {
        return listEmp;
    }

    public void setList_emp(ArrayList<Employee> listEmp) {
        this.listEmp = listEmp;
    }
    
    public void addEmployee(String name,int empId,int age, String gender,String startDate,String level,
            String teamInfo,String positionTitle,String cellPhoneNumber,String emailAddress,String photo) {

        Employee emp = new Employee(name, empId,age,gender,startDate,level,teamInfo,positionTitle,cellPhoneNumber,emailAddress,photo);

        listEmp.add(emp);
    }
    
    public Employee getEmployee(String name){
        
        for (Employee emp : listEmp) {
 
            if (emp.getName() == name) {
                return emp;
            }
        }
        return null;
    }
    
    public void deleteEmployee(String name){
        
        for (Employee emp : listEmp) {
 
            if (emp.getName() == name) {
                listEmp.remove(emp);
                break;
            }
        }
    }
    
    public ArrayList<Employee> nameFilter(String name) {

        ArrayList<Employee> list = new ArrayList<>();
        for (Employee emp : listEmp) {
            if (emp.getName().matches(name)) {
                list.add(emp);
            }
        }
        return list;
    }
    
    public ArrayList<Employee> teamInfoFilter(String team) {

        ArrayList<Employee> list = new ArrayList<>();
        for (Employee emp : listEmp) {
            if (emp.getTeamInfo().matches(team)) {
                list.add(emp);
            }
        }
        return list;
    }
    
    public ArrayList<Employee> positionFilter(String position) {

        ArrayList<Employee> list = new ArrayList<>();
        for (Employee emp : listEmp) {
            if (emp.getPositionTitle().matches(position)) {
                list.add(emp);
            }
        }
        return list;
    }
    public ArrayList<Employee> levelFilter(String level) {

        ArrayList<Employee> list = new ArrayList<>();
        for (Employee emp : listEmp) {
            if (emp.getLevel().matches(level)) {
                list.add(emp);
            }
        }
        return list;
    }
    
    public ArrayList<Employee> empIdFilter(int eId) {

        ArrayList<Employee> list = new ArrayList<>();
        for (Employee emp : listEmp) {
            if (emp.getEmpId() == eId) {
                list.add(emp);
            }
        }
        return list;
    }
    
    
    
}
