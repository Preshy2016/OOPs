package org.example;

public class Employee {
    private String name;
    private int empNumber;
    private String position;

    public Employee(String name, int empNumber, String position) {
        this.name = name;
        this.empNumber = empNumber;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}
