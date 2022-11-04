package turkcesorubankasi;

public class StringMnipulation {
    public static void main(String[] args) {
        //Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        //Örnek; 223878 ´ 37
        //1. Yol:
        int num = 223878;

        String s = String.valueOf(num);
        String d = "";
//        for (int i=0;i<s.length();i++){
//            String c=s.substring(i,i+1);
//
//            if(s.indexOf(c)==s.lastIndexOf(c)){d=d+c;}
//
//
//
//
//
//
//        }
        //       System.out.println(d);
       /*
       Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
A A A A
A A A A
A A A A
        */
        int rows = 3;
        int columns = 2;
//
//
//        for(int i=1;i<=rows;i++){
//
//            for(int k = 1 ; k<=columns;k++){
//
//                System.out.print("A"+" ");
//
//            }
//            System.out.println();
//        }
//
//        int i = 1;
//        while (i <= rows) {
//            for(int k = 1 ; k<=columns;k++){
//                System.out.print("*"+" ");
//            }
//
//
//
//
//
//            System.out.println();
//        i++;}

      /*
      Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
A
A A
A A A
A A A A
       */
        int sqtir = 4;
//        for(int i=1; i<=sqtir;i++){
//            for(int k=1;k<=i;k++){
//                System.out.print("A"+" ");
//            }
//            System.out.println();
//        }
//
//
//        int i=1;
//        do{
//            for (int k=1;k<=i;k++){
//                System.out.print("e"+" ");
//            }
//            System.out.println();
//       i++;
//        }while (i<=sqtir);
        /*
//        Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
//3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
//         */
//        for(int i =1; i<11;i++){
//
//            int n=3;
//            System.out.print(n+"x"+i+" ="+n*i+" ");
//        }
        //20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk
        //  bırakarak yazdırmak için gereken kodu yazınız.

//        for(int i =20;i>2;i--){
//            if( i%2!=0){
//
//                y=y+i+" ";
//            }
//        }
////        System.out.print(y);
//        String y ="";
//        int i =20;
//        while(i>2) {
//            if (i % 2 != 0) {
//
//                y = y + i + "";
//
//
//            }
//            i--;
//
//        }
//        System.out.println(y);
        //String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
        //Örneğin; 'Ali Can?' ==> l*i*a*n*
//
//        String j= "laLe en GuzeL cicektir";
//
//        j = j.replaceAll("[^a-z]", "");
//        String t = "";
//        for(Integer i=0; i<j.length(); i++){
//            String r = j.substring(i,i+1);
//            t = t + r + '*';
//        }
//        System.out.println(t);
        //Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
        //işaretiyle yazdırmak için gereken kodu yazınız.
        //Örneğin; 75.4238 ´ *4*2*3*8
          /*
    Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamların bulan bir kod yazınız.
    Ornek:
     String str ="$1 $12 €34 €56 $45 €78";
      dolarToplami: 58
      euroToplami: 168
     */
        String str ="$1 $12 €34 €56 $45 €78";
        String[]arr=str.split(" ");
int dol=0;
int euro=0;
        /*
       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.

       Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
       ekrana basan bir kod yazabilirsiniz.
    */
        int sayi=5;
        for(int i=1;i<=sayi;i++){
            for(int k=1;k<=sayi;k++  ){


                System.out.print(String.format("%02d",i*k)+" ");

            }
            System.out.println();
        }
        int sum=0;
        int counter=0;
        for(int i =0;i<=165;i=i+4){

            sum=sum+i;
            counter++;
        }

        System.out.println("hayatta kalma suresi = " + (counter-1));

    }
}