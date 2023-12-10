package org.example.oops.inheritance;

public class Main {

    public static void main(String[] args) {
        Box box1=new Box(7.9,8.7,4.6);
        Box box2=new Box(box1);

        BoxWeight boxWeight1=new BoxWeight(2,5.6,8,9);

        BoxWeight b5=new BoxWeight(boxWeight1);

        System.out.println(box1.l+" "+box1.h+" "+box1.w);

        System.out.println(boxWeight1.weight+" "+boxWeight1.w+" "+boxWeight1.h);

        Box b3=new BoxWeight();

        System.out.println(b3.l);

       // BoxWeight b4=new Box();//not possible






    }
}
