package turkcesorubankasi;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        //   Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
//        //Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)
//        List<Integer> grup = new ArrayList<>();
//        grup.add(12);
//        grup.add(15);
//        grup.add(10);
//        grup.add(15);
//        grup.add(9);
//
//        if (grup.contains(15)) {
//            for (Integer w : grup) {
//                if(w==15){
//                   int inx= grup.indexOf(w);
//                   grup.set(inx,51);
//
//                }
//
//
//            }
//            System.out.println(grup);
//
//        }else{
//            System.out.println("bu grup 15 icermiyor");
//        }


        //Listede 15 veya 13 varsa, bu elemanları kaldırınız.
//        List<Integer> gr = new ArrayList<>();
//        gr.add(12);
//        gr.add(10);
//        gr.add(10);
//        gr.add(13);
//        gr.add(9);
//        if(!(gr.contains(13)||gr.contains(15))){
//            System.out.println("bu sayilar yok");
//            System.out.println(gr);
//        }else{
//
//            for(int i=0;i<gr.size();i++){
//                if(gr.get(i)==15||gr.get(i)==13){
//                    gr.remove(i);
//                }
//
//
//            }
//            System.out.println(gr);
//        }

        /*Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
        Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür*/
//
//        List<Integer> h = new ArrayList<>();
//        h.add(12);
//        h.add(31);
//        h.add(15);
//        h.add(13);
//        h.add(54);
//        Collections.sort(h);
//        System.out.println(h);
//        int mindiff= h.get(2)- h.get(1);
//        for(int i =1 ; i<h.size();i++){
//            mindiff=Math.min(h.get(i)-h.get(i-1),mindiff);
//
//
//        }
//        System.out.println(mindiff);

        //Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
        // Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)
//        List<Integer> ha= new ArrayList<>();
//        ha.add(12);
//        ha.add(31);
//        ha.add(7);
//        ha.add(13);
//        ha.add(10);
//        for(Integer w:ha){
//
//            if (w==7||w==10){
//                continue;
//            }
//            ha.set(ha.indexOf(w),w+2);
//        }
//        System.out.println(ha);

        //String bir listede verilen tüm fiyatların toplamını bulunuz.{"$12.99", "$23.60", "$54.45"};
        //Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04

//        List<String> myList = new ArrayList<>();
//        myList.add("$12.99");
//        myList.add("$23.60");
//        myList.add("$54.45");
//        double top=0;
//        for(String w:myList){
//            top +=Double.valueOf(w.replace("$",""));
//        }
//        System.out.println(top);


        /*Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
        Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70*/
//
//        List<String> myList = new ArrayList<>();
//        myList.add("$12.99");
//        myList.add("$23.60");
//        myList.add("$8.25");
//        myList.add("$54.45");
//        List<Double> para=new ArrayList<>();
//
//        for(String w:myList){
//
//            para.add(Double.valueOf(w.replace("$","")));
//
//        }
//        System.out.println(para);
//        Collections.sort(para);
//        Double toplam=para.get(0)+para.get(para.size()-1);
//        System.out.println("toplam = " + toplam);
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(31);
//        myList.add(15);
//        myList.add(7);
//        myList.add(1);
//        myList.add(23);
//        Integer counter=0;
//        for(Integer w:myList){
//            for(Integer k:myList){
//                if(w==k){
//                    counter++;
//                }
//
//            }
//
//        }if(counter==myList.size()){
//            System.out.println(" tekrarlayan oge yok");
//        }else{
//            System.out.println("en az bir oge tekrarlanmistur");
        
        
      //  }
//        int num[] = {1, 2, 4, 5, 6, 8, 9, 11};//olmayan rakamları yazdıran kodu yazınız. (edited)
//        Arrays.sort(num);
//        for(int i=0;i<=11;i++){
//
//           int v= Arrays.binarySearch(num,i);
//
//           if(v<0){
//               System.out.print(i+" ");
//               System.out.println();
//
//           }
//        }

        /*
    ?
   ? ?
  ? ? ?
 ? ? ? ?
? ? ? ? ?

       Kullanicinin verecegi kenar uzunlugunu ve verecegi bir karakteri kullanarak eskenar ucgen cizen kod.

        */

//         int kenar=6;
//         for(int i=1;i<=kenar;i++){
//             for(int k=i; k<=kenar;k++){
//                 System.out.print(" ");}
//
//
//
//             for(int m=1; m<=i;m++){
//                 System.out.print("?"+" ");
//             }
//             System.out.println();
//
//         }
        /*
Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
Örnek: (Sarı, Mavi, Kırmızı, Yeşil) ==> Çıktı: Azalan sırada değil
        (Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sırada degil.

        Kirmizi Mavi Sari Yesil


 */

        List<String> list = new ArrayList<>();

        list.add("Sarı"); //70
        list.add("Mavi");
        list.add("Kırmızı");
        list.add("Yeşil");  //96

        List<String> sirali = new ArrayList<>();
        sirali.addAll(list);
        Collections.sort(sirali);
        System.out.println(sirali);

        List<String> sonSirali =new ArrayList<>();

        for(int i=sirali.size()-1;i>=0;i--){

            sonSirali.add(sirali.get(i));
        }
        System.out.println(sonSirali);

        if(list.equals(sonSirali)){
            System.out.println("Verilen list azalan siradadir");
        }else{
            System.out.println("Verilen list azalan sirada degildir.");
        }
    }

}
