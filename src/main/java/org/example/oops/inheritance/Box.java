package org.example.oops.inheritance;

public class Box {

    double l;
    double w;
    double h;

  public Box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

  public Box(double side){
        this.h=side;
        this.l=side;
        this.w=side;
    }

    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public Box(Box old){
      this.w=old.w;
      this.l=old.l;
      this.h=old.h;
    }

    public void information(){
        System.out.println("Running the Box");
    }

}
