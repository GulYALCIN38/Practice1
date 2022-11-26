package Mapssorubankasi;

import java.util.*;

public class Soru6 {
    /* verilen bir map te istenilen programlama lini bilen kisilerin isimlerin liste ekleyen bir methot yapin
    map1.put(101, "ali, can, java");
        map1.put(102, "aliye, cano, java");
        map1.put(103, "veli, pan, c5"); ====>[ali, aliye]
     */
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(101, "ali, can, java");
        map1.put(102, "aliye, cano, java");
        map1.put(103, "veli, pan, c5");
        String itenendil = "java";
        javabilenler(map1);


    }
    public static List<String> javabilenler(Map<Integer,String> map){
        Collection<String> isimler = map.values();
        List<String>isimlistesi=new ArrayList<>();
        for (String w:isimler){

                String []arr=w.replaceAll(" ","").split(",");
            if (arr[2].equalsIgnoreCase("java")) {
                isimlistesi.add(arr[0]);

            }
        }
        System.out.println(isimlistesi);
        return isimlistesi;

        }
    }

