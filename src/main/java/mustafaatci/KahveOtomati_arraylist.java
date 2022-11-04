package mustafaatci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KahveOtomati_arraylist {
    public static void main(String[] args) {
        //URUNLERIN HAZIRLANMASI
        List<String> urunler = new ArrayList<>();
        urunler.add("Su");
        urunler.add("Sicak su");
        urunler.add("Sutlu Filtre Kahve");
        urunler.add("Filtre Kahve");
        urunler.add("Americano");
        urunler.add("Espresso");
        urunler.add("Turk Kahvesi");
        urunler.add("Menengic");
        urunler.add("sicak cikolata");

        //FIYATLARIN HAZIRLANMASI
        List<Double> fiyatlar = new ArrayList<>();
        fiyatlar.add(1.00);
        fiyatlar.add(1.50);
        fiyatlar.add(3.00);
        fiyatlar.add(3.00);
        fiyatlar.add(3.00);
        fiyatlar.add(3.00);
        fiyatlar.add(4.00);
        fiyatlar.add(3.50);
        fiyatlar.add(50.00);
        urunler.set(2, "cappucino");

        //urun ve fyatlarin ekranda listelenmesi
        System.out.println("No\t\tFiyatlar\t\t\tUrunler");
        System.out.println("----------------------------------------------");

        for (int i = 1; i <= urunler.size(); i++) {
            System.out.print(i);
            for (int k = i - 1; k < i; k++) {
                System.out.println("\t\t" + fiyatlar.get(k) + "$" + "\t\t\t\t" + urunler.get(k));


            }

        }

        //kullanici hangi urunu ister
        Scanner input = new Scanner(System.in);
        System.out.println("\nlutfen urun no  girin");
        int no = input.nextInt();

        //seker bilgisi
        String cevap = "";
        if (no != 1 || no != 2) {
            System.out.println("seker ister misiniz??  E/H");

        }



    }


}

