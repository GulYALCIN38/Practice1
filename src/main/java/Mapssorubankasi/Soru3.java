package Mapssorubankasi;

import java.util.*;

public class Soru3 {
    public static void main(String[] args) {
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);
       Object[] sira= product.values().toArray();
        Arrays.sort(sira);
        System.out.println(Arrays.toString(sira));


    }
}
