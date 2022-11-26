package exeptionnn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06 {
    // 4 haneli kimlik no exeption hazirla
    public static void main(String[] args) {
        f2();

    }

    public static void f2() {
        Scanner input = new Scanner(System.in);
        System.out.println("tc gir");
        //int Tc = input.nextInt();

        try {
            int Tc = input.nextInt();
            if (Tc < 1000 || Tc > 9999) {
                throw new IllegalArgumentException("TC NO 4 HANELI OLMALIDIR");

            }else {
                System.out.println(Tc);
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            f2();
        } catch (InputMismatchException e) {
            System.out.println("tc no sayisal degerler olmalidir .....");
            f2();
        }
    }
}
