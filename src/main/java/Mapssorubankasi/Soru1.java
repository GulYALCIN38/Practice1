package Mapssorubankasi;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Soru1 {
    public static void main(String[] args) {
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        Integer i=0;
   for ( Map.Entry<String, Integer> w:product.entrySet()){

      i+= w.getValue();
   }
        System.out.println(i);
   Collection<Integer> sayilar=product.values();
   int sayi=0;
        for (Integer w:sayilar
             ) {
            sayi+=w;


        }
        System.out.println(sayi);
    }


}
