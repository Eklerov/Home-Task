package com.HomeTask.Task01;

/**
 * Created by Dmitry on 01.11.14.
 */
public class G1  {
  long properties;
     void setParam(int shift,int value){
        long mask=0xffff;

        mask=mask<<shift;
        mask=~mask
        ;
        properties =properties & mask;

        long a= (short) value;

        a=a<<shift;

        properties=properties|a;
}
    void setYear(int year){
        setParam(48,year);
     }
    void setWeight(int weight){
        setParam(36,weight);
    }
    void setAge(int age){
        setParam(16,age);

    }
    void setHeight(int height){
        setParam(0,height);
    }

    int getParam(int shift){
        long mask1=0xffff;

        long property=properties>>>shift;
        property=mask1&properties;
        return (int) property;
    }
    int getAge()
    {
        return getParam(16);
    }
    int getWeight(){
        return getParam(32);
    }
    int getYear(){
        return getParam(48);
    }
    int getHeight(){
        return getParam(0);
    }
    public static void main(String[] args){
        G1 ht= new G1();
       // ht.setAge(23);
      //  ht.setHeight(154);
        ht.setYear(34);
       // ht.setWeight(70);
        System.out.println(ht.getYear());
    }
}
