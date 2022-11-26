package Mapssorubankasi;

import java.util.*;

public class Soru5 {
    public static void main(String[] args) {
        List<String> hayvanlar=new ArrayList<>();
        hayvanlar.add("kus");
        hayvanlar.add("kedi");
        hayvanlar.add("kus");
        hayvanlar.add("kumru");
        hayvanlar.add("kus");
        hayvanlar.add("kedi");
        hayvanlar.add("kumru");
        hayvanlar.add("ari");

        Map<String,Integer> istatistik=new HashMap<>();
        for (String w:hayvanlar){
            Integer gorunumsayisi=istatistik.get(w);
            if (gorunumsayisi==null){
                istatistik.put(w,1);
            }else{
                istatistik.put(w,gorunumsayisi+1);

            }

        }
        System.out.println(istatistik);
        Collection<Integer> degerler=istatistik.values();
        int sayac=0;
        for(Integer w:degerler){
            if (w!=1){
                sayac++;
            }
        }
        System.out.println("tekrarli yazilan canli sayisi="+sayac);
    }
}
