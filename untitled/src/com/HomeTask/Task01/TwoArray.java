package com.HomeTask.Task01;

import java.util.Arrays;

/**
 * Created by Dmitry on 03.11.14.
 */
public class TwoArray {
    int [][] arr=new int[5][8];

     void createArr(){

        for(int i=0;i<5;i++ ){
            for(int j=0;j<8;j++){
                arr[i][j]=(int) ((Math.random()*89)+10);
            }
        }
    }
    void printArr(){
        for (int i=0;i < 5;i++,System.out.println()){
            for (int j=0;j < 8;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }

    public static void main(String [] args){

       TwoArray ar=new TwoArray();
        ar.createArr();
        ar.printArr();


                    }
                }



