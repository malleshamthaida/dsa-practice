package com.mst;

import java.util.*;
import java.util.stream.Collectors;

public class TestAppWF {

      public static void main(String[] args) {
            List<String> strList=new ArrayList<>(Arrays.asList("ab","abc","a"));
            //String ==  'ab',abc,'a'    ==  abc,ab,a

          strList.stream().sorted(Comparator.comparing(e->e.toString().length())
                  ).forEach(System.out::println);




        }
    }





    /*    // Student name,dept,marks  List --> toppers in each dept

           List<Student> studentList=new ArrayList<>(Arrays.asList( new Student("Mallesh","CSE",900),
                new Student("Saurabh","CSE",700),
                   new Student("Rakesh","CSE",950)));

    System.out.println(   studentList.stream().filter(e->e.getDept().equals("CSE")).
                max(Comparator.comparing(Student::getMarks)).stream().findFirst().get().getName());

        studentList.stream().collect(Collectors.groupingBy(Student::getMarks,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getMarks)), Optional::get))






    }
}

    class Student{
        private  String name;
        private String dept;
        private int marks;

        public Student(String name, String dept, int marks) {
            this.name = name;
            this.dept = dept;
            this.marks = marks;
        }

        public String getDept() {
            return dept;
        }

        public void setDept(String dept) {
            this.dept = dept;
        }

        public int getMarks() {
            return marks;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

*/
