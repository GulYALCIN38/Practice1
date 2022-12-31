package bibliotheque;

import java.util.*;

public class Deneme {
    /*
 * ==================== PROJE==============================
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
 * yazar adi ve fiyat bilgileri istenmeli*/
    // Kitapcı_KitapEkle kitap = new Kitapcı_KitapEkle();
     LinkedHashMap<Integer,Kitapbilgi> kutuphane=new LinkedHashMap<>();
     Set<Map.Entry<Integer,Kitapbilgi>> entries= kutuphane.entrySet();
     int counter=1000;
     Scanner input = new Scanner(System.in);


    public  void menu(){
        do{
        System.out.println("kutuphane ile ilgili islem yapmak icin menuden islem  seciniz\n" +
                "kitap eklemek icin 1\n numara ile kitap goruntulemek icin 2\n bilgi ile kitap goruntulemek icin 3\n" +
                "numara ile kitap silmek icin 4\n tum kitaplari listelemek icin 5\n cikis icin 6 ya basin");


              int  islem=input.nextInt();

            if(islem==6){
            System.out.println("sistemden ayrildiniz gule gule");
            break;
        }
        switch (islem) {
            case 1:
                kitapEkle();
                break;
            case 2:
                numaraIleKitapGor();
                break;
            case 3:
                bilgiIleKitap();
                break;
            case 4:
                numaraIleKitapSil();
                break;
            case 5:
                kitapListele();
                break;

            default:
                System.out.println("gecerli no girin");
                break;
        }
        }while(true);


    }
    private  void kitapEkle(){
        input.nextLine();//nextline hata vermesin diye bir bos nextline atiyoruz
        System.out.println("lutfen kitap ismi ekleyin ");
        String kitapAdi= input.nextLine();


        System.out.println("lutfen yazar ismi ekleyin ");
        String yazarAdi= input.nextLine();

        System.out.println("lutfen kitap fiyati ekleyin ");
        double fiyati= input.nextDouble();

        counter++;

        kutuphane.put(counter,new Kitapbilgi(kitapAdi,yazarAdi,fiyati));
        System.out.println("verdiginiz bilgiler basari ile kutuphanemize eklenmistir .Kitapnumaraniz="+counter);
        System.out.println(kutuphane);

        //System.out.println();







    }
    private  void numaraIleKitapGor(){
        System.out.println("goruntulemek istediginiz kitap numarasini giriniz");
        int kitapNo= input.nextInt();
        if(kutuphane.containsKey(kitapNo)){
            System.out.println(kutuphane.get(kitapNo));
        }else{
            System.out.println("Boyle bir numara kutuphane listesinde kayitli degildir, tekrar deneyin");
            numaraIleKitapGor();
        }

    }

    private  void bilgiIleKitap(){
        System.out.println("hangi bilgi ile kitapa ait tum verilere ulasmak istiyorsunuz?\nkitap adi icin 1\n kitabin yazari icin 2\n" +
                "kitabin fiyati icin 3 e basin");
        int secim= input.nextInt();
        input.nextLine();

        switch (secim){


            case 1:
                System.out.print("kitap adi giriniz  ");
                String kitapIsmi=input.nextLine();
                input.nextLine();
                for ( Map.Entry<Integer, Kitapbilgi> w:entries) {
                    if(w.getValue().kitapAdi.equals(kitapIsmi)){
                        System.out.println(w);
                    }else {
                        System.out.println("bu isme kayitli bir kitap bulunmamaktadir");
                    }


                }
                break;
            case 2:
                System.out.print("yazar adi giriniz  ");
                String yazarIsmi=input.nextLine();
                for ( Map.Entry<Integer, Kitapbilgi> w:entries) {
                    if(w.getValue().yazarAdi.equals(yazarIsmi)){
                        System.out.println(w);
                    }else {
                        System.out.println("bu yazar a ait bir kitap bulunmamaktadir");
                    }


                }
                break;
            case 3:
                System.out.println("kitap fiyati giriniz");
                double fiyat=input.nextDouble();
                for ( Map.Entry<Integer, Kitapbilgi> w:entries) {
                    if(w.getValue().fiyati==fiyat){
                        System.out.println(w);
                    }else {
                        System.out.println("bu fiyata sahip bir kitap bulunmamaktadir");
                    }


                }
                break;
            default:
                System.out.println("gecersiz bir deger girdiniz");
                bilgiIleKitap();

        }

    }
    private  void numaraIleKitapSil(){
        System.out.println("Silmek istediginiz kitap numarasini giriniz");
        int silinecekNo= input.nextInt();
        if(kutuphane.containsKey(silinecekNo)){
            kutuphane.remove(silinecekNo);
            System.out.println("girus yaptiginiz numara silinmistir");
        }else{
            System.out.println("Boyle bir numara kutuphane listesinde kayitli degildir, tekrar deneyin");
            numaraIleKitapSil();
        }

    }
    private  void kitapListele(){
        System.out.println(kutuphane);
        menu();
    }
    private static void cikis(){
        System.out.println("kutuphane sisteminden ayrildiniz" );

    }
}
