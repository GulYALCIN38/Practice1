package exeption;

public class Exeption03 {
    public static void main(String[] args) {
        System.out.println(divideStringBynumofthechar(""));
        System.out.println(divideStringBynumofthecharacter(""));
        System.out.println(divideStringBynumofthechars(null));
    }
    //stringyeki karaktersayisini bul,integere cevir ve karakter sayisina bol
    public static double divideStringBynumofthechar(String str){
        int lenght=0;
        int i=0;
        double sonuc=0;

        try

    {
         lenght = str.length();//nullpointerexeotion null string ile lenght methot kullanirsak

         i = Integer.valueOf(str);//numberformat exeption icinde rakamdan farkli sey olursa


        sonuc= i / lenght;//aritmetic exeption
    }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("==="+e.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return sonuc;
    }
    public static double divideStringBynumofthecharacter(String str){
        int lenght=0;
        int i=0;
        double sonuc=0;

        try

        {
            lenght = str.length();//nullpointerexeotion null string ile lenght methot kullanirsak

            i = Integer.valueOf(str);//numberformat exeption icinde rakamdan farkli sey olursa


            sonuc= i / lenght;//aritmetic exeption
        }catch(Exception e){
            System.out.println("''=="+e.getMessage());

        }
        return sonuc;
    }
    public static double divideStringBynumofthechars(String str){
        int lenght=0;
        int i=0;
        double sonuc=0;

        try

        {
            lenght = str.length();//nullpointerexeotion null string ile lenght methot kullanirsak

            i = Integer.valueOf(str);//numberformat exeption icinde rakamdan farkli sey olursa


            sonuc= i / lenght;//aritmetic exeption
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("==="+e.getMessage());
        }
        return sonuc;
    }
}
