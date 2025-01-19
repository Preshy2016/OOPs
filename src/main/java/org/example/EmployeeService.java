package org.example;

public interface EmployeeService {
    public void addEmployee(Employee employee);
    public void removeEmployee(int index);
    public void displayEmployees();
    public void updateEmployee(Employee employee, int index);
}
