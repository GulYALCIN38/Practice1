package map;

import java.util.Hashtable;
import java.util.Map;

public class Hashtable01 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
        ht1.put(4, "four");
        ht1.put(5, "five");
        ht1.put(6, "six");
        //ht1.put(null, "six");//null kabul eder amaNullPointerException

        System.out.println(ht1);//{6=six, 5=five, 4=four, 3=three, 2=two, 1=one}
        System.out.println(ht1.values());//[six, five, four, three, two, one]
        System.out.println(ht1.keySet());//[6, 5, 4, 3, 2, 1]
        System.out.println(ht1.keys());//java.util.Hashtable$Enumerator@1e643faf//bu sadece hashtable da calisir
        System.out.println(ht1.entrySet());//[6=six, 5=five, 4=four, 3=three, 2=two, 1=one]
        for(  Map.Entry<Integer, String> w:ht1.entrySet()){
            System.out.println(w.getKey() + " " + w.getValue());
        }
        //bir kitabin  id ismi  yazari, Yayımcı, miktar olarak map olusturmak istiyoruz


    }


}
