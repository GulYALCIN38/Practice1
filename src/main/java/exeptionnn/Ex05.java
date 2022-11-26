package exeptionnn;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
         /*
        Verilen bir String array de bulunan urunu elde edebilmek icin kod yazma.
         */

        String[] str = {"Elma", "Armut", "Kiraz"};
        sec(str);
    }


    public static void sec(String[] str) {
        Scanner scan = new Scanner(System.in);
        System.out.println("hangi urunu istiyorsunuz");
        int index = scan.nextInt();

        try {
            System.out.println(str[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("gecerli no gir" + e.getMessage());
            sec(str);
        }
    }
}
