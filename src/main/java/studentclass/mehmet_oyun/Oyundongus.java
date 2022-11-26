package studentclass.mehmet_oyun;

import java.util.Scanner;

import static studentclass.mehmet_oyun.Stringekleme.sonkelime;

public class Oyundongus {
    static int puan1=0;
    static int puan2=0;
    static void oyunDongusu(String name1, String name2, String kelime) {
        System.out.println(name2 + ", " + kelime + "kelimesini kabul ediyor musun  E/H");
        Scanner input = new Scanner(System.in);
        char kelimekabulmu = input.next().toUpperCase().charAt(0);

        if (kelimekabulmu == 'E') {
            puan1 += kelime.length();
            System.out.println(name1 + "icin guncel puan" + puan1);
            System.out.println(name2 + "ouna devam etmek istiyormusun?  E/H");
            char devammi = input.next().toUpperCase().charAt(0);
            if (devammi == 'E') {
                System.out.println(kelime + "kelimesine ekliyecegin eki yaz");
                String ek = input.next().toUpperCase();
                kelime = sonkelime(kelime, ek);
                System.out.println(name1 + ", " + kelime + "kelimesini kabul ediyor musun  E/H");
                kelimekabulmu = input.next().toUpperCase().charAt(0);
                if (kelimekabulmu == 'E') {
                    puan2 += kelime.length();
                    System.out.println(name2 + "icin guncel puan" + puan1);
                    System.out.println(name1 + "ouna devam etmek istiyormusun?  E/H");
                    devammi = input.next().toUpperCase().charAt(0);
                    if (devammi == 'E') {
                        System.out.println(kelime + "kelimesine ekliyecegin eki yaz");
                        ek = input.next().toUpperCase();
                        kelime = sonkelime(kelime, ek);
                        oyunDongusu(name1, name2, kelime);
                    }
                }
            }
        }
    }}
