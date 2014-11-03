package com.HomeTask.Task01;

import java.util.Scanner;

/**
 * Created by Dmitry on 04.11.14.
 */
public class SimpleNumbers {
    static int n;
    public static void main(String[] args){

        Scanner sc=new Scanner((System.in));
        n=sc.nextInt();


int i=1;
       while (i<n){
           i++;
           if(i==2){
               System.out.println(i);

           }
           if(i%2==0){
               continue;
           }
           else{
               System.out.println(i);


       }





}
}
}