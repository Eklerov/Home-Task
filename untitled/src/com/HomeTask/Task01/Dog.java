package com.HomeTask.Task01;

/**
 * Created by Dmitry on 27.10.14.
 */
public class Dog{
    String name ;
    String says;
    void methodSpot(){
        System.out.println("Ruff");
    }
    void mathodSruffy(){
        System.out.println("Wurf");
    }
    public static void main (String[] args){
      Dog spot=new Dog();
      Dog sruffy=new Dog();

        spot.methodSpot();
        sruffy.mathodSruffy();



    }

}