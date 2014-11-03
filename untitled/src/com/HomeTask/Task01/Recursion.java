package com.HomeTask.Task01;

import java.util.Scanner;

/**
 * Created by Dmitry on 04.11.14.
 */
public class Recursion {


    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
     int  n=sc.nextInt();

        Recursion r=new Recursion();
        r.method(n);
        System.out.println(r.method(n));


    }
    static int method(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;

        }
        else{
            return n+method(n-1);
        }

    }
}
