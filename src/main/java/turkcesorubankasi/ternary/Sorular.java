package turkcesorubankasi.ternary;

public class Sorular {
    public static void main(String[] args) {

       /* ernary kullanarak, aşağıdaki kodları konsolda yazdırınız.
                Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
                Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"*/

        String s = "KSY67";
        String gecerlimi = s.replace(" ", "").length() >= 8 ? ("GECERLI") : ("GECERSIZ");
        System.out.println(gecerlimi);

        /*
        Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "
int
         */

        int a = 10;
        int b = 1;
        int c = 70;
        String ucgenturu = a == b && b == c ? "eskenar ucgen" : (a == b && b != c || a == c && b != c || c == b && a != c) ? "ikizkenar" : " cesitkenar";
        System.out.println("ucgenturu = " + ucgenturu);

        /*
        Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa
yuvarla”
b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”
Örneğin; 127 yukarı yuvarlanacak ve değer 130 olacaktır.
125 yukarı yuvarlanacak ve değer 130 olacaktır.
123 aşağı yuvarlanacak ve değer 120 olacaktır.
         */

        int sayi=121;
        int sonuc= sayi%10>=5?( (sayi/10+1)*10    ):(     (sayi/10)*10    );
        System.out.println("sonuc = " + sonuc);


        /*
        Nested Ternary kullanarak Apex kodunu yazınız.
Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız.
Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir.
Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir.
         */

        int yil =2001;
        String artikYilmi= yil%100==0?(yil%400==0?("artik yil"):("artik yil degil")):( yil %4==0? ("aertik yil"):("artik yil degil"));
        System.out.println("artikYilmi = " + artikYilmi);
    }

}
