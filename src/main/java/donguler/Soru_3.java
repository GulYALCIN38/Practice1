package donguler;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {
        /*
    /EX;3;  kullanicidan aldigimiz bir stringin, yine  kullanicidan aldigimiz baslangic ve bitis indexi
      arasini ekrana yazdiran bir methot olusturalim    ornek= merhaba (1,4)==>erh
     */
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir string  girin");
        String s= input.next();   //merhaba
        System.out.println(" baslangic ve bitis indexi girin");
        int bas= input.nextInt();
        int bitis= input.nextInt();
        kendiSubstrungimiz(s,bas,bitis);



    }
    public static void kendiSubstrungimiz(String a,int baslangic, int bitiss ){
        if(baslangic>bitiss){
            System.out.println("baslangic index daha buyuk olamaz");
        }else if(bitiss>a.length()-1){
            System.out.println("bitis indexi karakter sayisindan buyuk olamaz");
        }else{
            for(int i=0;i<a.length();i++){
                if(i>=baslangic&&i<bitiss){
                    System.out.print(a.substring(i, i + 1));
                }


            }
            System.out.println();
        }

    }

}
