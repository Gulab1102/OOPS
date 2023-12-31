package org.example.oops.generic;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;

    private int size=0;

    public CustomArrayList() {
        data=new Object[DEFAULT_SIZE];
    }

    public void add(T element){
        if(isFull()){
            resize();
        }

        data[size]=element;
        size++;
    }

    private boolean isFull(){
        return size==data.length;
    }
    private void resize(){
        Object[] temp=new Object[data.length*2];

        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
public T remove(){
        T removed = (T) data[--size];
        return removed;
}
public T get(int index){
        return (T) data[index];
}
public int size(){
        return size;
}
public void set(int index,T value){
        data[index]=value;
}

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> arrayList=new CustomArrayList<Integer>();

//        arrayList.add(4);
//        arrayList.add(8);
        for(int i=0;i<12;i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);

        arrayList.add(Integer.valueOf("123"));

       // ArrayList<Integer> arr=new ArrayList<>();

        System.out.println(arrayList.remove());
        System.out.println(arrayList.size());
    }

}
