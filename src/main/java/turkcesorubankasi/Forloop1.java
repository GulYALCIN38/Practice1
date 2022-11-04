package turkcesorubankasi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Forloop1 {
    public static void main(String[] args) {
       // Bir sayinin asal sayi olup olmadigini belirten kodu yazin
        int sayi =100;
        int counter=0;
        for(int i=2;i<sayi;i++){
            if(sayi%i==0){
                counter++;
                System.out.print(i +" ");
            }

        }
        if(counter==0){
            System.out.println(" asal sayidir");
        }else{
            System.out.println(" asal degil");
        }



    }

}
