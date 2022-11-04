package donguler;

import java.util.Scanner;

public class Soru_5 {
    public static void main(String[] args) {

        /*
        EX;5; kullanicidan bir sifre isteyi
        ilk harf kucuk OLMALI
        son karakter rakam olsun
        eger bu saglanmiyorsa whilw loop ile tekrar tekrar sifre isteyin
         */



        StringBuilder strBld = new StringBuilder("learnjava");
        System.out.println(strBld.substring(3));
        System.out.println(strBld);
        System.out.println(strBld.insert(0, "you"));
        System.out.println(strBld);
        strBld.delete(4,5);
        System.out.println(strBld);
        StringBuilder str = new StringBuilder();
        str.append("Javamanyakkk");
        System.out.println(str.capacity() + "," + str.length());
        StringBuilder sb3 = new StringBuilder("learn");
        System.out.println("Before tr!m: " + sb3.capacity());
        sb3.trimToSize();
        System.out.println("After tr!m: " + sb3.capacity());
    }
}
