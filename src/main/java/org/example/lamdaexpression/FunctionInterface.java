package org.example.lamdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Funct1{
    void absfun(int x);
    default void normalFun()
    {
        System.out.println("Hello");
    }
}


public class FunctionInterface {

    interface F1{
        int operation(int a,int b);
    }
    interface F2{
        void message(String m);
    }
  private   int operand(int a,int b,F1 x){
      return   x.operation(a,b);
    }

    public static void main(String[] args) {
    Funct1 funct1= (int x)->{
        System.out.println("1 parameter output- "+2*x);

    };
   funct1.absfun(5);

        List<Integer> arr=  Arrays.asList(2,4,6,9);

        arr.forEach(n->{
            if(n%2==0) System.out.println("Even number output- "+n);
        });
F1 add=(int a ,int b)->{
    return a+b;
};
F1 mul=(int a ,int b)->a*b;

FunctionInterface functionInterface=new FunctionInterface();
        System.out.println("output of F1-"+functionInterface.operand(4,6,mul));


    }
}
