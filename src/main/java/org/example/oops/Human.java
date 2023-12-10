package org.example.oops;

public class Human {
   static class Animal{
  String name;
 Animal(String name){
     this.name=name;
 }

    }

static int a=4,b;
    int age;
    String name;
    int salary;
    boolean maried;

  static long population;

    Human(int age,String name,int salary,boolean maried){
        this.age=age;
        this.name=name;
        this.maried=maried;
        this.salary=salary;
        Human.population+=1;
    }
static void message(){
    System.out.println("this is static message");
   // System.out.println(this.age); not allowed
    System.out.println(population);
}

static {
    System.out.println("This is static Block");
    b=a*4;
    System.out.println("a-"+a+" b "+b);
}
    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", maried=" + maried +
                '}';
    }
}
