package studentclass.mehmet_oyun;

import java.util.Scanner;

public class Stringekleme {
    static String sonkelime;
    public static String  sonkelime(String kelime,String ek){
        Scanner input = new Scanner(System.in);
        System.out.println(ek+ " ekini kelimenin neresine eklieyeceksin. B/S");
        char basmisonmu=input.next().toUpperCase().charAt(0);
        if(basmisonmu=='B'){
            sonkelime=ek+kelime;
        } else if (basmisonmu=='S') {
            sonkelime=kelime+ek;

        }else{
        System.out.println("cevabi b veya s olarak gir");
        sonkelime(kelime, ek);}
        return sonkelime;
    }
}
