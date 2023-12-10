package org.example.oops;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.example.oops.Practice.message;

class Student implements Comparable<Student>{
    int rollno;
    String name;

    Student(int rollno,String name){
        this.name=name;
        this.rollno=rollno;
    }

    @Override
    public boolean equals(Object obj) {
        Student s= (Student)obj;
        if(this.rollno==s.rollno&&this.name.equals(s.name))return true;
        return false;
    }

    @Override
    public int compareTo(Student s) {
        return this.rollno-s.rollno;
    }
}

public class Main {

    public static void main(String[] args) {
      //  message();;
//
//        int x[]=new int[5];
//
//        String[] names=new String[10];
//
//        Student s1=new Student(2,"Gulab");
//        Student s2=new Student(2,"Gulab");
//
//        System.out.println(s1.equals(s2));
//
//        Set<Student> st=new HashSet<>();
//        st.add(s1);

        Human h1=new Human(25,"Gulab",100000,true);

        Human h2=new Human(26,"Gulab",10000,true);
        System.out.println("h1 Population- "+Human.population);
        //refernce with class name
        System.out.println("h2 Population- "+Human
                .population);

// only static method or variable can be called from static block
// to call non static required references
//greeting();

        System.out.println(Human.b);
        Human.b=Human.b*2;
        System.out.println(Human.b);

        Human.Animal am1=new Human.Animal("gkp");
        Human.Animal am2=new Human.Animal("priya");

        System.out.println(am1.name);
        System.out.println(am2.name);
    }

   void greeting(){
        System.out.println("This is greeting ");
    }
}
