package studentclass.seyma.constractor;

import java.util.Scanner;

public class Constractor {
    int sayi;

    public Constractor(int i) {
        sayi = i;
    }
    void goster(){
        System.out.println("girilen sayi="+sayi);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz; ");
        int n= input.nextInt();
        Constractor constractor=new Constractor(n);
        constractor.goster();

    }
}
