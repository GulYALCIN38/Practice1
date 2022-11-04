package ahmet_hc;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        /*
        ilk harf kucuk son karakter rakam olsun eger bu saglanmiyorsa whilw loop ile tekrar tekrar sifre isteyin
         */
        String s = " ";
        int counter = 0;
        boolean sifregecerlimi = false;
        while (sifregecerlimi != true) {
           Scanner input = new Scanner(System.in);
            System.out.println("sifre gir");
            s = input.next();

            counter = 0;

            if (!(s.charAt(0) >= 'a' && s.charAt(0) <= 'z')) {
                System.out.println("gecersiz tekrar dene");
                counter++;
            }
            if (!(s.charAt(s.length() - 1) >= '0' && s.charAt(s.length() - 1) <= '9')) {
                System.out.println(" yanlis sifre yeniden  son karakter sayi gir");
                counter++;
            }

            if (counter == 0) {
                sifregecerlimi = true;
            }
        }
        //ex kullanicidan  sayi ve us degerlerini alip olusturdugunuz bir methotla yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println( "bir sayi ve bir us gir");
        int say= input.nextInt();
        int u= input.nextInt();

usHesapla(say,u);


    }
    public static void usHesapla(int sayi,int us){

        int sonuc=1;
        while(us>0){

            sonuc*=sayi;
            us--;
        }
        System.out.println(sonuc);
    }


}


