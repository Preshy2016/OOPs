package org.example;

public class Main {
    public static void main(String[] args) {
       EmployeeServiceImpl obj = new EmployeeServiceImpl();
       Employee emp1 = new Employee("Precious", 2123,"Junior SE");
       Employee emp2 = new Employee("Hardy",1033,"Intern");
        Employee emp3 = new Employee("Chadwick",1130,"Senior SE");

       obj.addEmployee(emp1);
       obj.addEmployee(emp2);
       obj.addEmployee(emp3);


       obj.updateEmployee(new Employee("Bontle", 1129, "Junior BA"),2);
       obj.displayEmployees();

//       obj.removeEmployee(0);
//       obj.displayEmployees();





    }
}