package com.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public record Employee(int id, String name, double salary, int deptId) {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Smith", 50000, 101));
        employees.add(new Employee(2, "Alice", 60000, 102));
        employees.add(new Employee(3, "Charlie", 55000, 101));
        employees.add(new Employee(4, "David", 70000, 103));
        employees.add(new Employee(5, "John", 48000, 102));

        Map<Integer, Double> deptSalaryMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::deptId,
                        Collectors.summingDouble(Employee::salary)));

        // Print department id with total salary of each department

        System.out.println("DeptID Total Salary");
        deptSalaryMap.forEach((deptId, totalSalary) ->
                System.out.println(deptId + "    " + totalSalary));

    }
}

/*

 SQL : SELECT deptId, SUM(salary) AS total_salary
       FROM employee
       GROUP BY deptId;
 */

