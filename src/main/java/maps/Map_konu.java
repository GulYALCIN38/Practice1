package maps;

import java.util.*;

public class Map_konu {
    /*
    **** Reel projelerde en cok kullanilan java elemanidir.database yapsina cok uygundur
    * ***** cunku bir elemana ait cok fazla bilgiyi bir entry set te  depolayabilirsiniz
    *
    * examle:
    Math={'isim;Taner kaya', 'email;th@gmail.com', age21, successtrue}
    *
     1)Map'ler key-value dan olusan entry-set lerden olusur .
     2)Key'ler unique'dir
     3)Value'lar tekrarli data icerebilir
     4)Map'lerde eleman degil EntrySet kullaniriz.
     5)Key'ler tekrarsiz bir sekilde null kabul eder.
     6)Value'lar null kabul eder.
     7)HashMap'ler EntrySet'leri herhangibir siralamaya tabi tutmaz, rastgele siralar VE HIZLIDIR
     8)  Turleri
        -Hashtable
        -HashMap
        -LinkedHashmap
        -TreeMap....


     */
    public static void main(String[] args) {
        HashMap<String,Double>manav=new HashMap<>();
        manav.put("elma",8.20);
        manav.put("brokoli",3.0);
        manav.put("ispanak",4.5);
        manav.put("kiraz",7.5);
        manav.put("kayisi",20.0);
        manav.put("marul",2.0);
        System.out.println(manav.get("kiraz"));
        System.out.println(manav.remove("brokoli"));
        System.out.println(manav.containsKey("marul"));
        Set<Map.Entry<String,Double>> deger=manav.entrySet();
        System.out.println(deger);


    }
}
