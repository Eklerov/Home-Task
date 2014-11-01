package com.HomeTask.Task01;

/**
 * Created by Dmitry on 29.10.14.
 */
public class Tickets {
    public static boolean intToArr(int in) throws IllegalArgumentException {
        if (in<=0) throw new IllegalArgumentException();

        int[] res = new int[999999];
        int curPos = 0, x, y;
        boolean flag=false;

        do
        {
            res[curPos] = in%10;
            in /= 10;
        }
        while(++curPos<999999);
        x=res[0]+res[1]+res[2];
        y=res[3]+res[4]+res[5];
        if (x==y){


  flag=true;
         }
        return flag;


    }
    public static void main(String[] args) {
        int min=100000, max=900000, number=0;
        for (int i=min; i<max; i++){
            if (intToArr(i)==true){
                number++;
                System.out.println("№"+number+":"+i);
            }
        }
        System.out.println("Колличество счастливых билетов:"+number);
    }
}

