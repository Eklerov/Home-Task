package com.HomeTask.Task01;

/**
 * Created by Dmitry on 29.10.14.
 */
 class Fibo {
static int count=0;

public static void main(String [] args){
Fibo f=new Fibo();
    int i=0;
    while(i<15){


        ++i;
        f.fib(0);


        System.out.println(fib(i)+" "+count);
    }

}

  static int fib(int n) {

          if(n==0){
              return 0;
          }
          if(n==1){
              return 1;
          }

          else {

          count++;
              return fib(n-1)+fib(n-2);
          }

  }


}

