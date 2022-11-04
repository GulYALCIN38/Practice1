package sule_hc.packece01;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("fibonacci uzunlugunu giriniz ");
        int uzunluk=input.nextInt();
        int x=1;
        int y=1;
        int f=0;
        System.out.print(x+","+y);
        for(int i= 1 ;i<uzunluk-1;i++){
         f=x+y;
            System.out.print(","+f);
            x=y;
            y=f;
        }
    }
}
