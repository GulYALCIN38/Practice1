package turkcesorubankasi;

import java.util.Scanner;

public class WrapIr {
    public static void main(String[] args) {
        /*Soru 6) Interview Question Kullanicidan 100'den kucuk bir tamsayi isteyin. l'den başlayarak
        girilen sayiya kadar tum sayilari yazdirin. Ancak;
        - şayi 3'un kati ise şayi yerine "Java" yazdirin.
                - şayi 5'in kati ise şayi yerine "Güzeldir" yazdirin.
                - şayi hem 3'un hem 5'in kati ise şayi yerine "Java Güzeldir" yazdirin.*/

        ////TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.
        Scanner input = new Scanner(System.in);
        //System.out.println("lutfen GIN ISMI BAS HARF GIRIN girin");
        /*int x= input.nextInt();
        int y= input.nextInt();
        if (x<0&&y<0){
            System.out.println("III. bolge");
        } else if (x>0&&y>0){
            System.out.println("I. bolge");
        }else if (x>0&&y<0){
            System.out.println("IV. bolge");
        }else if (x<0&&y>0){
            System.out.println("II. bolge");
        }else {
            System.out.println("orgine");
        }*/
        //Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun  isimlerini yazdirin
        ////Ornek: ilkHarf=P output = "Pazar, Pazartesi veya Persembe"
        //// ilkHarf=S output = "Sali"
        /*String g= input.next().toUpperCase();
        switch (g){
            case "P":
                System.out.println("pazartesi,pazar,persembe");
                break;
            case "S":
                System.out.println("sali");
                break;
            case "C":
                System.out.println("cuma,carsamba,cumartesi");
                break;

            default:
                System.out.println("gecerli harf girin");*/

/*
TASK :
Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
1. 0(dahil) ile 50 arasi - D
2. 50(dahil) ile 60 arası - C
3. 60(dahil) ile 80 arası - B
4. 80(dahil) ustu- A
Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin

 */

        //Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM
        String s= "gul";
        String ters="";
//        for(int i = s.length()-1;i>-1;i--){
//           String son= s.substring(i,i+1);
//           ters =ters+son;
//
//
//        }
//        System.out.println(ters);

        //Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için
       // kod yazınız.
        String c=" Christmas";
        String l="";
        int i =0;
        while(i<c.length()){
            if(!c.substring(i,i+1).equals("m")){
                l=l+c;
            }else{break;}


            i++;
        }

        System.out.println(l);


    }


}





















