package org.example;

import java.util.ArrayList;

public class EmployeeServiceImpl implements EmployeeService{

    ArrayList <Employee> employees = new ArrayList<>();

    public EmployeeServiceImpl() {

    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);

    }

    @Override
    public void removeEmploye(int index) {
        employees.remove(index);
    }



    @Override
    public void displayEmployees(){
        for(Employee emp: employees){
            System.out.println("Name: " + emp.getName() + ", Employee Number " +  emp.getEmpNumber() + ", Position: " + emp.getPosition());
        }
    }

    @Override
    public void updateEmployee(Employee employee, int index) {
        Employee update = employees.get(1);
        update.setName("ouydcjxfhxcghjv");
    }


}
