package turkcesorubankasi;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

/*
    Bir top belirli yükseklikten atılmaktadır.(Scanner ile yüksekliği al)
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
    */

public class IcArrayleri_toplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("haydi bir kelime gir");
        String kelime = input.next().trim();
       int a= kelime.length();
       if(a%2!=0){

           System.out.println(kelime.substring(a/2,(a/2)+1));
       }else{
           System.out.println(kelime.substring((a/2)-1,(a/2)+1));
       }







    }
}
