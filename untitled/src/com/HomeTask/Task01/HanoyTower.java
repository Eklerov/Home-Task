package com.HomeTask.Task01;

import java.util.Scanner;

/**
 * Created by Dmitry on 04.11.14.
 */
public class HanoyTower {
    static int n;
   static int hanoys(int n,int from,int buf,int to){

       if(n==0){
           return 0;
       }
       if(n==1){
return hanoys(1,0,0,1);
       }
       if(n==2){
           return hanoys(2, 0, 1, 2);
       }
       else{
           return hanoys(n,n-1,1,n);
       }
   }

public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    HanoyTower r=new HanoyTower();
    r.hanoys(0, n, 0, 0);
    System.out.println();

}


}
