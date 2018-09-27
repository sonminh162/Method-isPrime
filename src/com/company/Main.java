package com.company;

import java.util.Scanner;

public class Main {
    public static boolean isPrime(int number){
        int i;
        for(i=2;i<=Math.sqrt(number);i++){
            if(number%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i;
        for(i=0;i<1000;i++){
            if(isPrime(i)){
                System.out.print(i+"\t");
            }
        }

    }
}
