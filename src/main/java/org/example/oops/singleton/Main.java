package org.example.oops.singleton;

public class Main {

    public static void main(String[] args) {
        //all 3 instance same
        Singleton obj1=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
        Singleton obj3=Singleton.getInstance();


    }
}
