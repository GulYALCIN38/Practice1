package Mapssorubankasi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Soru2 {
    public static void main(String[] args) {
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        Set<String> urunler=product.keySet();
//        for (String w:urunler){
//            if(w.equalsIgnoreCase("laptop")){
//                System.out.println("laptop var");
//                break;
//            }else{
//                System.out.println("laptop yok");
//            }
        String expectedProduct = "Laptop";
        if(product.containsKey(expectedProduct)){
            System.out.println(expectedProduct + " vardir");
        }else{
            System.out.println(expectedProduct + " yoktur");
        }
    }

    }

