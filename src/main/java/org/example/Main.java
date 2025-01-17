package org.example;

public class Main {
    public static void main(String[] args) {
       EmployeeServiceImpl obj = new EmployeeServiceImpl();
       Employee emp1 = new Employee("Pre", 23,"Pff");
        Employee emp2 = new Employee("Lah", 3,"ff");



       obj.displayEmployees();
       obj.updateEmployee(emp1, 0);
    }
}