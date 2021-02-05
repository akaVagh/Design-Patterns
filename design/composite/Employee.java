/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.composite;

import java.util.*;

/**
 *
 * @author harsh vaghani
 */
public class Employee {

    private String name;
    private String department;
    private List<Employee> subordinates;
// constructor

    public Employee(String name, String dept) {
        this.name = name;
        this.department = dept;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString() {
        return ("Employee :[ Name : " + name
                + ", dept : " + department + " ]");
    }
}
