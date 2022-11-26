package exeptionnn;

public class Ex3 {
     /*
        Verilen bir Stringin karakter sayisini ekrana yazdirip ardindan String i integer a cevirip yazdiran method.
         */
     public static void main(String[] args) {
         cevir("12e" );

     }
     private static void cevir(String s){

         try {
             int a=s.length();
             System.out.println(a);

                 int p=Integer.valueOf(s);
                 System.out.println(p);
             } catch (NumberFormatException e) {
                 System.out.println("numara olamayan veriler var");;

             }
          catch (NullPointerException e) {
             System.out.println("string bos olamaz"+e.getMessage());
         }

         System.out.println("gulegule");
     }

}
