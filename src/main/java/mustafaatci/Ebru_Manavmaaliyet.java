package mustafaatci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ebru_Manavmaaliyet {
    /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

        Ipucu:
        Class icinde 3 method olacak
         * main() isimli bir method
         * musteriSecimi() isimli bir method
         * kasa() isimli bir method
         * */

    static Scanner input = new Scanner(System.in);
    static List<String> urunler = new ArrayList<>(Arrays.asList("muz","seftali","ispanak","brokoli","havuc"));

    //FIYATLARIN HAZIRLANMASI
   static List<Double> fiyatlar = new ArrayList<>(Arrays.asList(2.50,2.00,3.5,1.5,2.0));
   static double toplamTutar;

    public static void main(String[] args) {

        //URUN VE FIYATLARIN EKRANA YAZDIRILMASI
        System.out.println("no\t\t\t fiyatlar \t\turunler \n" + "*".repeat(45));
        for (int i = 1; i <= urunler.size(); i++) {

            System.out.print(i);
            for (int j = i - 1; j < i; j++) {
                System.out.println("\t\t" + fiyatlar.get(j) + "$\t\t\t\t" + urunler.get(j));

            }

        }
        musteriSecim();

    }
    private static void musteriSecim(){

        System.out.println("hangi urunu secmek istersiniz numarasini girin");
        int secim=input.nextInt();
        System.out.println("kac kg urun istersiniz");
        double miktar= input.nextDouble();
        double urunTutari=miktar* fiyatlar.get(secim-1);
        toplamTutar+=urunTutari;
        System.out.println("BASKA BIR URUN ALMAK ISTER MISINIZ EVET ICIN 1 HAYIR ICIN 2 YE BASIN");
        int no= input.nextInt();
        if (no==1){
            musteriSecim();



        }else{
        System.out.println("odenecek toplam tutar= "+toplamTutar+"$");}




    }
}





























