package maps;

import java.util.HashMap;
import java.util.Scanner;

public class KimlikProjeMap {
    /*
                     1) Kullanicidan kimlik numarasini(4 haneli), tam ismini, adresini, telefonunu, alin
                     2) Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin

                     saveInfo() method olusturun:
                     3)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
                     4)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
                     5)Ayni kimlik numarasi ile bilgi girilmesine engel olun.

                	 getInfo() method olusturun:
          		     1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
                     2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.

                     removeInfo() method olusturun:
                     1)Kimlik numarasini girerek data silin.
                     2)Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
                     3)Collection bos ise kullaniciya hata mesaji verin.

                     selectOption() method olusturun:
                     1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
               */
     Scanner input = new Scanner(System.in);
     HashMap<Integer, String> vatandas = new HashMap<>();

//    public static void main(String[] args) {
//        selectInfo();
//
//    }

    public  void selectInfo() {
        System.out.println("yapmak istediginiz islemi seciniz\n cikmak icin 0 \nkayit icin  1 \n kayit bilgisi gormek icin 2 \n" +
                "kayitli bilgilerini silmek icin 3 e basin");
        int secim = input.nextInt();
        switch (secim) {
            case 0:
                System.out.print("Sistemden basari ile ayrildiniz");
                break;
            case 1:
                saveInfo();
                break;
            case 2:
                getInfo();
                break;
            case 3:
                removeInfo();
                break;
        }


    }

    private  void saveInfo() {
        System.out.print("4 haneli kimlik no giriniz");
        int tc = input.nextInt();
        input.nextLine();
        if (vatandas.containsKey(tc)) {
            System.out.println("girdiginiz tc zaten kayitli tekrar deneyin");
            saveInfo();
        } else {
            System.out.print("lutfen isminizi girin");
            String ad = input.nextLine();

            System.out.print("lutfen soyisminizi girin");
            String soyad = input.nextLine();

            System.out.print("lutfen tel no girin");
            String tel = input.nextLine();

            System.out.print("lutfen adres girin");
            String adres = input.nextLine();

            String values = ad + " " + soyad + " " + tel + " " + adres;

            vatandas.put(tc, values);
            System.out.println(" bilgileriniz basariyla kaydedilmistir");


        }
        selectInfo();
    }

    private  void getInfo() {
        System.out.print("gormek istediginiz bilgiler icin tc numarasi giriniz");
        int arananTc = input.nextInt();
        if (vatandas.containsKey(arananTc)) {
            System.out.println(vatandas.get(arananTc));
        } else {
            System.out.println("boyle bir Tc numarasi sistemimizde kayitli degil, tekrar deneyin");
            getInfo();
        }


        selectInfo();
    }

    private  void removeInfo() {//accolade
        System.out.print("silmek istediginiz bilgiler icin tc numarasi giriniz");
        int silinecekTc = input.nextInt();
        if (vatandas.containsKey(silinecekTc)) {
            vatandas.remove(silinecekTc);
            System.out.println(" silmek istediginiz kimlik bilgileri silinmistir ");

        } else {
            System.out.println("boyle bir Tc numarasi sistemimizde kayitli degil, tekrar deneyin");
            removeInfo();

        }

        selectInfo();
    }

}
