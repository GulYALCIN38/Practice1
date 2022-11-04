package turkcesorubankasi;

public class Methodcreation01 {
    public static void main(String[] args) {

        int sayi=10;
        System.out.println(asalmi(sayi));

    }
    public static String asalmi(int sayi){

       String sonuc="";
       for (int i=2;i<sayi;i++){
           if(sayi%i==0){
               sonuc="asal degil";
               break;
           }else{
               sonuc=" asal";
           }

       }
return sonuc;

    }
}
