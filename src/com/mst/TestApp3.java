package com.mst;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestApp3 {
    public static void main(String[] args) {
      List<Employee> empList=
              Arrays.asList(
             new Employee[] { new  Employee ( 11, "Raj", 101, "active", 20000.0),
        new Employee ( 12, "Ram", 102, "Inactive", 2000.0),
       new  Employee ( 13, "Shyam", 101, "Inactive", 40000.0),
        new Employee ( 14, "Rama", 102, "active", 27000.0),
       new Employee ( 15, "Babu", 101, "active", 17000.0)});

    // Map<String,Integer> map=empList.stream().collect(Collectors.groupingBy(Employee::getDepId,
      //       Collectors.maxBy(Comparator.comparing(Employee::getSal))));


    }



}


class Employee{


    int id;
    String name;
    int depId;
    String status;
    double sal;


    public Employee(int id, String name, int depId, String status, double sal){
        this.id=id;
        this.name=name;
        this.depId=depId;
        this.status=status;
        this.sal=sal;

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

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
