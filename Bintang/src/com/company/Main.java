package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = 0;
        int x;
        System.out.print("Masukkan Angka : ");
        x = sc.nextInt();
        for(int i=0;i<=x;i++){
            for(int k=x;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=l;j++){
                System.out.print("*");
            }
            l+=2;
            System.out.println(""); }
        l -= 4;
        x = x*2;
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
        System.out.println();
        for(int i=(x-1);i>=1;i--){
            for(int k=i;k<=(x-1);k++){
                System.out.print(" ");
            }
            for(int j=l;j>=1;j--){
                System.out.print("*");
            }
            l-=2;
            System.out.println("");
        }
    }
}
