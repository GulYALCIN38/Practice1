package ahmet_hc;

import studentclass.seyma.Arrays3;

import java.util.Arrays;
import java.util.Scanner;

public class market_constractor {

    //kullanicidan istedigi kadar sayi alip array olusturun.bitirmek isterse 0 a bassin
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] brr = {0};
        int girilen = 0;
        do {
            System.out.println("bir sayi girin");
            girilen = input.nextInt();

            if (brr[0] == 0) {

                brr[0] = girilen;
            } else if (girilen != 0) {

               brr= Arrays3.ekle(brr, girilen);
            }

        } while (girilen != 0);

        System.out.println(Arrays.toString(brr));
    }
}
