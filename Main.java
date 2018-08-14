package com.pluralsight;

public class Main {

    public static void main(String[] args) {
        int x=0;
        while (x<4 ){
            System.out.print("a");
            if(x<1){
              System.out.print("an")  ;
            }
            ;
            if(x>1){
                System.out.print(" ");

                x=x+1;
            }
            if(x==1){
                System.out.print("noise");
            }
            if(x<2){
                System.out.print("oyster");
            }
            System.out.println("");
            x+=1;
        }
    }
}
