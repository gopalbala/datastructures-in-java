package com.gb.datastructures.practice.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeImportance {
    public int getImportance(List<Employee> employees, int id) {
        empMap = new HashMap<>();
        for (Employee emp : employees) {
            empMap.put(emp.id, emp);
        }
        Employee employee = empMap.get(id);
        if (employee == null)
            return 0;

        sumImp(employee);

        return impSum;
    }

    int impSum;
    Map<Integer, Employee> empMap;

    void sumImp(Employee employee) {
        if (employee.subordinates == null)
             impSum =+ employee.importance;
        impSum += employee.importance;
        for (Integer integer : employee.subordinates) {
            employee = empMap.get(integer);
            sumImp(employee);
        }
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Employee employee = new Employee();
        List<Integer> sub = new ArrayList<>();
        sub.add(2);
        sub.add(3);
        employee.id = 1;
        employee.importance = 5;
        employee.subordinates = sub;
        employeeList.add(employee);

        employee = new Employee();
        sub = new ArrayList<>();
        sub.add(4);
        employee.id = 2;
        employee.importance = 3;
        employee.subordinates = sub;
        employeeList.add(employee);

        employee = new Employee();
        employee.id = 3;
        employee.importance = 4;
        employeeList.add(employee);

        employee = new Employee();
        employee.id = 4;
        employee.importance = 1;
        employeeList.add(employee);

        EmployeeImportance employeeImportance = new EmployeeImportance();
        int imp = employeeImportance.getImportance(employeeList, 1);

        System.out.println(imp);


    }

}


class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;


};

//public int getImportance(List<Employee> employees, int id) {
//        Map<Integer, Employee> empMap = new HashMap<>();
//        for(Employee emp: employees){
//        empMap.put(emp.id, emp);
//        }
//        Employee employee = empMap.get(id);
//        if(employee == null)
//        return 0;
//        int impSum = employee.importance;
//        List<Integer> sub = employee.subordinates;
//        for(Integer empId: sub) {
//        impSum+= empMap.get(empId).importance;
//        }
//        return impSum;
//        }