package turkcesorubankasi;

import java.util.HashMap;
import java.util.Scanner;

public class Kendiproje {
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
    static Scanner input = new Scanner(System.in);
     static HashMap<Integer, String> vatandas = new HashMap<>();

    public static void main(String[] args) {
        selectInfo();

    }

    public static void selectInfo() {
        System.out.println("lutfen kimlik bilgileri ile ilgili islem seciniz \n" +
                "cikmak icin =0\n" +
                "kayit icin= 1\n kayit bilgisi gormek icin 2\n" +
                "kayit silmek icin 3 e basin");
        int secim = input.nextInt();
        switch (secim) {
            case 0:
                System.out.println("sistemden basari ile ayrildiniz");
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
            default:
                System.out.println("lutfen gecerli sayi girin");
        }
    }


    private static  void saveInfo() {
        System.out.print("lutfen 4 haneli tc no giriniz");
        int tc = input.nextInt();
        input.nextLine();
        if (vatandas.containsKey(tc)) {

            System.out.println("bu tc zaten kayitli lutfen yeni tc girin");
            saveInfo();
        } else {


            System.out.print("lutfen isminizi girin");
            String ad = input.nextLine();

            System.out.print("lutfen soy isminizi girin");
            String soyad = input.nextLine();

            System.out.print("lutfen adres girin");
            String adres = input.nextLine();

            System.out.print("lutfen tel girin");
            String tel = input.nextLine();

            String values = ad + " " + soyad + " " + adres + " " + tel;

            vatandas.put(tc, values);


            System.out.println("bilgileriniz basari ile kaydedildi");
        }

        selectInfo();
    }


    private static  void getInfo() {
        System.out.print("lutfen gormek istediginiz kimlik bilgileri icin tc numarasi giriniz");
        int arananTc = input.nextInt();
        if (vatandas.containsKey(arananTc)) {
            System.out.println(vatandas.get(arananTc));

        } else {
            System.out.println("boyle bir tc no sistemde kayitli degil,tekrar deneyin");
            getInfo();

        }
        selectInfo();
    }

    private static void removeInfo() {
        System.out.print("lutfen silmek istediginiz kimlik bilgileri icin tc numarasi giriniz");
        int slinecekTc = input.nextInt();
        if (vatandas.containsKey(slinecekTc)) {

            vatandas.remove(slinecekTc);
        } else {
            System.out.println("boyle bir tc no sistemde kayitli degil,tekrar deneyin");
            removeInfo();
        }
        selectInfo();

    }


}

