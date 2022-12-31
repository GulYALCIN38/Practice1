package map;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        /*
            Aşağıdaki anahtarlara ve değerlere sahip olacak bir MAP oluşturun
            Math = 9
            inglizce = 8
            Farsca = 7
            Turkce = 6
            Fransizce = 7
            Ardından, 7'den fazla olan tüm dersleri ve puanlarını yazdırın
             */
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("Math", 9);
        hm1.put("inglizce", 8);
        hm1.put("Farsca", 7);
        hm1.put("Turkce", 6);
        hm1.put("Fransizce", 7);
        for (Map.Entry<String, Integer> w:hm1.entrySet()){
            if(w.getValue()>7){
                System.out.println(w);
            }
        }
    }
}
