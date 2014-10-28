package com.HomeTask.Task01;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 * Created by Dmitry on 27.10.14.
 */
public class Numbers{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
  //  System.out.println("Ты меня заебал!может ты число введешь!?");
 // int j=sc.nextInt();

int n=(int) (((Math.random())*155)+5);
    System.out.println(n);

    for( int i=25;i<100;i++){
    if(n==i){
        System.out.println("Число совпало!"+" "+n);
        }


        }
    }
}




