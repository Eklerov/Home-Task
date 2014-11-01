package com.HomeTask.Task01;
import  java.util.*;
/**
 * Created by Dmitry on 29.10.14.
 */
public class Cycle {
     void countNumber(){
        int n;
        int s=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        do
            s = s + (n % 10);
        while((n/=10) != 0);

        System.out.println(s + " ");
    }
    public static void main(String [] args){

Cycle cy=new Cycle();
        cy.countNumber();

}
}