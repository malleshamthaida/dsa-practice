package com.mst.java8.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeList {

    public static List<Employee> getEmpList(){
        List<Employee> empList=new ArrayList<>();
        Employee e1=new Employee();
        e1.setEid(102);
        e1.setName("Mallesh");
        e1.setSalary(90000);
        e1.setDoj(new Date("10/01/2024"));
        e1.setDept("IT");

        Employee e2=new Employee();
        e2.setEid(103);
        e2.setName("Ramesh");
        e2.setSalary(15000);
        e2.setDoj(new Date("10/01/2024"));
        e2.setDept("IT");

        Employee e3=new Employee();
        e3.setEid(104);
        e3.setName("Latha");
        e3.setSalary(20000);
        e3.setDoj(new Date("11/05/2024"));
        e3.setDept("IT");

        Employee e4=new Employee();
        e4.setEid(105);
        e4.setName("Aarush");
        e4.setSalary(25000);
        e4.setDoj(new Date("12/06/2024"));
        e4.setDept("Finance");

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);

        return empList;
    }

    public static void print(List<Employee> empList){
        empList.forEach(e->{
            System.out.println(e.getEid() + " "+e.getName() + " "+e.getSalary()+" "+e.getDept() + " "+e.getDoj());
        });
        System.out.println("==========================================");

    }

}
