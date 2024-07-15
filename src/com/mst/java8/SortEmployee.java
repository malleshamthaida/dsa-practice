package com.mst.java8;

import com.mst.java8.util.Employee;
import com.mst.java8.util.EmployeeList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployee {
    public static void main(String[] args) {
        List<Employee> empList= EmployeeList.getEmpList();
        EmployeeList.print(empList);
    //Filter
       //List<Employee> newList= empList.stream().filter(e->e.getSalary()>20000).collect(Collectors.toList());
        //EmployeeList.print(newList);
        empList.stream().sorted(Comparator.comparing(Employee::getDoj).
                thenComparing(Employee::getSalary));
        EmployeeList.print(empList);
    }
}
