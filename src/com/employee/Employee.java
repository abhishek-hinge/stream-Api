package com.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Employee {

    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        List<Employee> employee = Arrays.asList(
                new Employee(3, "Smith", 1300),
                new Employee(4, "Jones", 1200),
                new Employee(2, "Allen", 1400),
                new Employee(1, "King", 1500)
        );

        /*

        Maximin and Minimum salary

        */

        Employee employee1 = employee.stream()
                .max(Comparator.comparing(Employee::getSalary)).get();

        Employee employee2 = employee.stream()
                .min(Comparator.comparing(Employee::getSalary)).get();

        System.out.println("Employee getting maximum salary : " + employee1.getName()+" "+employee1.getSalary());
        System.out.println("Employee getting minimum salary : " + employee2.getName()+" "+employee2.getSalary());

        /*

       sorting based on id

        */

        List<Employee> list = employee.stream()
                .sorted(Comparator.comparing(Employee::getId))
                .toList();

        System.out.println(list);

    }

}
