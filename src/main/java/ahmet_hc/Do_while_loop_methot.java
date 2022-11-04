package ahmet_hc;

import java.util.Scanner;

public class Do_while_loop_methot {
    /*
     for (int i = 0; i < sifre.length(); i++) {
                if (sifre.charAt(i) <= 'z' && sifre.charAt(i) >= 'a') {
                    bayrak++;
                    break;
                }
            }
            if(bayrak==0){
                System.out.println("sifre kucuk harf icermeli");
            }
    kullanicidan bir sifre alin
    sifre kucuk harf buyuk harf ozel karakter  icermeli en az 8 karakter olmali
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sifre;
        int bayrak;
        boolean sifredogrumu;
        do {

            System.out.println(" lutfen bir sifre girin");
            sifre = input.next();
            bayrak = 0;
            int sonuc = kucukHarfControlYap(sifre);
            bayrak = bayrak + sonuc;

            sonuc = buyukHarfControlYap(sifre);
            bayrak = bayrak + sonuc;

            sonuc = ozelKrakterKontroluYap(sifre);
            bayrak = bayrak + sonuc;
            if (sifre.length() >= 8) {
                bayrak++;

            } else {
                System.out.println(" sifre 8 den buyuk olsu");
            }


        } while (bayrak != 4);
        System.out.println("sifreniz basariile kayit oldu");
    }

    private static int ozelKrakterKontroluYap(String sifre) {
        int bayrak = 0;

        if (sifre.replaceAll("\\W", "").length() != sifre.length()) {
            bayrak++;
        } else {
            System.out.println(" ozel karakter icersin sifreniz");
        }
        if (bayrak == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    private static int buyukHarfControlYap(String sifre) {
        int bayrak = 0;
        for (int i = 0; i < sifre.length(); i++) {
            if (sifre.charAt(i) <= 'Z' && sifre.charAt(i) >= 'A') {
                bayrak++;
                break;
            }
        }
        if (bayrak == 0) {
            System.out.println("sifre buyuk harf icermeli");
            return 0;
        } else {
            return 1;
        }
    }

    private static int kucukHarfControlYap(String sifre) {
        int bayrak = 0;
        for (int i = 0; i < sifre.length(); i++) {
            if (sifre.charAt(i) <= 'z' && sifre.charAt(i) >= 'a') {
                bayrak++;
                break;
            }
        }
        if (bayrak == 0) {
            System.out.println("sifre kucuk harf icermeli");
            return 0;
        } else {
            return 1;
        }
    }
}



