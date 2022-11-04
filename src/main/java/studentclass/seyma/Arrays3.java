package studentclass.seyma;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays3 {

    public static void main(String[] args) {
        //Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.
        Scanner input = new Scanner(System.in);
        String [] arr={"sevgi", "yavrum", "gel","artik","guldemimm"};
        int []brr={1,4,6,7};
        int sayi=9;
        ekle(brr,sayi);


    }

    public static  int[] ekle(int[] brr, int eklenensayi) {
        int [] srr=new int [brr.length+1];
        int index=0;
        for (int i = 0; i < brr.length; i++) {
            srr [index]=brr[i];
            index++;
        }
        srr[srr.length-1]=eklenensayi;
        return srr;
    }

}


