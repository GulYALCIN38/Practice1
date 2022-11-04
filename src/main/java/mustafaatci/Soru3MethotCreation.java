package mustafaatci;

import java.util.Scanner;

public class Soru3MethotCreation {
    //kullanicidan bir sayi al ve sonuclar tek basamakli olana kadar rakamlari topla or; 38  3+8=11 1+1=2
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir sayi girin");
        int sayi= input.nextInt();

        System.out.println(toplamayaDevammi(sayi));

    }
    public static int toplamayaDevammi(int a) {
        while(a>=10){
            a=basamaklariTekSayiOlanaKadarTopla(a);
        }
        return a;


    }

    public static int basamaklariTekSayiOlanaKadarTopla(int a) {

        int topla=0;
        int rakam=0;
        while(a>0){
            rakam=a%10;
            topla+=rakam;
            a/=10;
        }
        return topla;
    }

    }




