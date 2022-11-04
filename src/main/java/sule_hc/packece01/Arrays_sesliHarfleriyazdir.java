package sule_hc.packece01;

import java.util.Scanner;

public class Arrays_sesliHarfleriyazdir {
    public static void main(String[] args) {
        //Kullanicidan alinan bir Stringde gecen sesli harfleri console yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen String bir ifade giriniz ");
        String str = input.nextLine().toLowerCase();

        String[] harfler = str.split("");

        for (String w : harfler) {

            if((w.equals("a"))||
            (w.equals("e"))||(w.equals("u"))||(w.equals("i"))||(w.equals("o"))){

                System.out.print(w + " ");
            }
            }
        }

    }


