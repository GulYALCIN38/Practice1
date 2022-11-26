package Mapssorubankasi;

import java.util.*;

public class Soru4 {
    public static void main(String[] args) {
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);
        Set<String> urun=product.keySet();
        List<String> uruns=new ArrayList<>(urun);
        Collections.sort(uruns);
        System.out.println(uruns);
    }
}
