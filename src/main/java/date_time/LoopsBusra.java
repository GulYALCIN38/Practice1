package date_time;

import java.util.Arrays;

public class LoopsBusra {
    public static void main(String[] args) {

/*
    INTERWIEW QUESTIONS
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
        String s = "alicanll";
        String[] f = s.trim().split("");
        Arrays.sort(f);
        int counter = 0;
        for (int i = 1; i < f.length; i++) {

            if (f[i - 1].equals(f[i])) {
                counter++;
            } else {
                System.out.println(f[i - 1] +( counter + 1)+ "defa var ");
                counter = 0;
            }
if (i==f.length-1){System.out.println(f[i ] +( counter + 1)+ "defa var ");}
        }


    }
}
