package bibliotheque;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Kutuphane extends Bilgiler {
    /* ==================== PROJE==============================
     * bir kitapci icin program yazalim kitap no 1000'den baslayacak sirali no olsun program
     * baslayinca menu isminde bir method calissin
     * 1-kitap ekle-//kitapEkle()
     * 2-numara ile kitap goruntule-//numaraIleKitap()
     * 3-bilgi ile kitap goruntule-//bilgiIleKitap()
     * 4-numara ile kitap sil-//numaraIleSil()
     * 5-tum kitaplari listele-//kitapListele()
     * 6-cikis-//cikis()
     ************************************
     * 1.olarak her kitaba ait kitap no olacak, sonra kitap adi olacak, buna ait
     * yazar adi olacak ve kitap fiyati olacak bu bilgilerin tutulacagi bir yer
     * olmali yani bir list'te tutmamiz gerek
     * 2-kitap numarasi 1000'den
     * baslamali,her kitap eklendiginde bir artacagi icin sayac gibi dusunulebilinir
     * count=1000; menu isminde bir method olusturmaliyim,
     * 3-kitap ekle diye bir
     * method olusturmliyim,bu method farkli bir classda
     * 4-kullanicidn kitap adi
     * yazar adi ve fiyat bilgileri istenmeli
     */

    LinkedHashMap<Integer, Bilgiler> kutuphane = new LinkedHashMap<>();
    Set<Map.Entry<Integer, Bilgiler>> entries = kutuphane.entrySet();
    int counter = 1000;
    Scanner input = new Scanner(System.in);

    public void kitapEkle() {
        //input.nextLine();
        System.out.println("lutfen kitap ismi ekleyin");
        //String kitapAdi=input.nextLine();
        setKitapadi(input.nextLine());
        System.out.println("lutfen yazar ismi ekleyin");
        //String yazarAdi=input.nextLine();
        setYazaradi(input.nextLine());

        System.out.println("lutfen kitap fiyati ekleyin");
        //double fiyati=input.nextDouble();
        setFiyati(input.nextDouble());
        counter++;
        kutuphane.put(counter, new Bilgiler(getKitapadi(), getYazaradi(), getFiyati()));
        System.out.println("kitabiniz basari ile kayit oldu. numarasi " + counter);


    }

    private void numaraIleKitapGor() {
        System.out.println("goruntulemek istediginiz kitap numarasini giriniz");
        int kitapNo = input.nextInt();
        if (kutuphane.containsKey(kitapNo)) {
            System.out.println(kutuphane.get(kitapNo));
        } else {
            System.out.println("boyle bir numara bulunmuyor");
            numaraIleKitapGor();
        }
    }

    private void bilgiIleKitap() {
        System.out.println("Hangi bilgi ile kitap verilerine ulasmak istersiniz?\n" +
                "kitap adi 1\n yazar adi  2 \n fiyati 3 e basin");
        int secim = input.nextInt();
        switch (secim) {
            case 1:
                System.out.println("kitap adi girin");
                String kitapIsmi = input.nextLine();

                int sayac = 0;
                for (Map.Entry<Integer, Bilgiler> w : entries) {
                    if (w.getValue().getKitapadi().equalsIgnoreCase(kitapIsmi)) {
                        System.out.println(w);
                        sayac++;

                    }


                }

                if (sayac == 0) {
                    System.out.println("bu isme ait kitap yok");
                }
                break;
            case 2:
                System.out.println("yazar adi girin");
                String yazarIsmi = input.nextLine();

                int sayac1 = 0;
                for (Map.Entry<Integer, Bilgiler> w : entries) {
                    if (w.getValue().getYazaradi().equalsIgnoreCase(yazarIsmi)) {
                        System.out.println(w);
                        sayac1++;

                    }


                }

                if (sayac1 == 0) {
                    System.out.println("bu yazara ait kitap yok");
                }
                break;
            case 3:
                System.out.println("kitap fiyati girin");
                double fiyat = input.nextDouble();

                int sayac3 = 0;
                for (Map.Entry<Integer, Bilgiler> w : entries) {
                    if (w.getValue().getFiyati() == fiyat) {
                        System.out.println(w);
                        sayac3++;

                    }


                }

                if (sayac3 == 0) {
                    System.out.println("bu fiyatta ait kitap yok");
                }
                break;
            default:
                System.out.println("gecersiz bir deger girdiniz");
                bilgiIleKitap();


        }

    }
    private void numaraIleSil(){
        System.out.println("silmek istediginiz kitap no girin");
        int silinecekNo=input.nextInt();
        if(kutuphane.containsKey(silinecekNo)){
            kutuphane.remove(silinecekNo);
            System.out.println("girdiginiz numaraya ait kitap bilgileri silindi");
        }else {System.out.println("Boyle bir numara kutuphane listesinde kayitli degildir, tekrar deneyin");
            numaraIleSil();

        }



    }


}
