package studentclass.mehmet_oyun;

import java.util.Scanner;

import static studentclass.mehmet_oyun.Oyundongus.*;

public class Runner {
    static String kelime;
    static String name1;
    static String name2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("birinci oyuncu ismi gir");
        name1= input.next().toUpperCase();
        System.out.println("ikkinci oyuncu ismi gir");
         name2= input.next().toUpperCase();
        System.out.println(name1 +"oyunu baslatan kelimeyi gir");
        kelime= input.next().toUpperCase();
        System.out.println(kelime);
        oyunDongusu(name1,name2,kelime);
        System.out.println(name1+": "+puan1);
        System.out.println(name2+": "+puan2);

        if (puan1 > puan2) {
            System.out.println(name1 + " oyunu kazandi");
        } else if (puan2 > puan1) {
            System.out.println(name2 + " oyunu kazandi");
        } else {
            System.out.println("oyun berabere bitti");
        }









}}
