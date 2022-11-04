package sule_hc.packece01;

import java.util.Arrays;
import java.util.Scanner;

public class Array_enbuyukenkucukfarki {
    /*Kullanıcının girdigi bir array'in en buyuk elemani ile
   en kucuk elemanının  farkını bulan kodu yaziniz
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Array'in uzunlugunu giriniz ");
        int uzunluk=input.nextInt();
        int []arr=new int[uzunluk];
        

        for (int i = 0; i <uzunluk; i++) {

            System.out.println("bir sayi girin");
            int sayi=input.nextInt();
            arr[i]=sayi;

        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
       int fark= arr[uzunluk-1] -arr[0];
        System.out.println(fark);

    }
}
