package day09_IfStatements;

import java.sql.SQLOutput;

public class PosNegZero {

    public static void main(String[] args) {

        int n = 100;

        if(n > 0){
            System.out.println("Positive");
        }

        if(n < 0){
            System.out.println("Negative");
        }

        if(n ==0){
            System.out.println("Zero");
        }


        System.out.println("--------------------------");

        boolean positive = n>0;
        boolean negative = n<0;
        boolean zero = n == 0;

        if(positive){
            System.out.println(n+" is positive");
        }else if (negative){
            System.out.println(n+" is negative");
        }else{
            System.out.println(n+" is zero");
        }
    }
}
