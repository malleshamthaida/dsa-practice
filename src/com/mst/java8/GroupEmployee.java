package com.mst.java8;

import com.mst.java8.util.Employee;
import com.mst.java8.util.EmployeeList;

import java.util.Formattable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupEmployee {
    public static void main(String[] args) {
        List<Employee> empList= EmployeeList.getEmpList();
       Map<String,List<Employee>> map= empList.stream().collect(Collectors.groupingBy(Employee::getDept));

       map.entrySet().stream().forEach(elem->{
           System.out.print(elem.getKey() +" :: ");
           elem.getValue().stream().forEach(e->{
            System.out.println( e.getEid() + " "+e.getName() + " "+e.getSalary()+" "+e.getDept()
                    + " "+e.getDoj());
           });
           System.out.println("===============");
       });
    }
}
