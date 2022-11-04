package turkcesorubankasi;

public class Loopsfor {
    public static void main(String[] args) {
        //Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        //aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.
        //1. Yol:
        String s = "runnur";
        String r = "";
//        for (int i = s.length() - 1; i > -1; i--) {
//            String c = s.substring(i, i + 1);
//            r = r + c;
//        }
//        if (s.equals(r)) {
//            System.out.println(s + " palindromdur");
//        } else {
//            System.out.println(s + " palindrom degildir");
//        }
//
//        int i = s.length() - 1;
//        while (i > -1) {
//
//            String c = s.substring(i, i + 1);
//            r = r + c;
//
//            i--;
//        }
//        if (s.equals(r)) {
//            System.out.println(s + " palindromdur");
//        } else {
//            System.out.println(s + " palindrom degildir");
//        }

       /*
        Adada yalnız bir maymun var
        Her gün 4 muz yemesi gerekiyor
        o adada sadece 165 muz var
        Aşağıdaki değişkenleri oluşturun ve maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.
        Do while döngüsü, artırma ve eksiltme ve if deyimlerini kullanın
        int MuzSayısı =165, hayatta kalmaDays = 0;
        boolean maymunAlive = true;
        */
        //Maymunun kac gun hayatta kalacagini gosteren kod
        //Hayatta kaldigi suerece muz vermelisin(DO While)
        //eger 4 ten az muz kalirsa maymunlar olur
//int sum=0;
//int counter=0;
//        for(int i =0;i<=165;i=i+4){
//
//          sum=sum+i;
//          counter++;
//        }
//
//        System.out.println("hayatta kalma suresi = " + (counter-1));
//
//        int sum = 0;
//        int counter = 0;
//        int i = 0;
//        do {
//
//            sum = sum + i;
//            counter++;
//
//
//            i = i + 4;
//        } while (i <= 165);
//        System.out.println("hayatta kalma suresi = " + (counter-1));
        /*
     Kullanicidan toplanmak uzere sayilar isteyin.
     Sayi adedi 10'u gecerse yada toplami 500'u gecerse
    " Bu kadar sayi yeter ...adet sayi girdiniz toplami..." yazdirin
      /*
     Kullanicidan toplanmak uzere sayilar isteyin.
     Sayi adedi 10'u gecerse yada toplami 500'u gecerse
    " Bu kadar sayi yeter ...adet sayi girdiniz toplami..." yazdirin
     */
//        Scanner input = new Scanner(System.in);
//
//        int sum = 0;
//        for (int i = 1; i <= 523; i++){
//            System.out.println("bir sayi gir git");
//        int sayi = input.nextInt();
//        sum = sum + sayi;
//
//       if(sum>500) {
//           break;
//       }
//
//    }
//        System.out.println("sum = " + sum);

        //Asagidaki sekli yazdiran kodu yaziniz
//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6
//

//        for(int i=1;i<7;i++){
//
//            for(int k=1;k<=i;k++){
//                System.out.print(" ");
//
//            }for(int m=i;m<=6;m++){
//                System.out.print(m+" ");
//            }
//            System.out.println();
//        }
        int sayi = 107;
        int counter=0;
        for (int i=2;i<sayi;i++){

            if(sayi%i==0){

                counter++;
            }
        }
        if (counter==0){
            System.out.println(" asal sayi ");
        }else{
            System.out.println("asl sayi degil");
        }
        int carpim=1;
       for (int i=1;i<=5; i++){
           for(int k=1; k<=i;k++){

               System.out.print(i*k+" ");
           }
           System.out.println();
       }



    }
}
