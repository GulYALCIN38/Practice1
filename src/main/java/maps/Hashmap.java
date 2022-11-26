package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        Map<Integer,Isci> hashmap=new HashMap<>();

        Isci isci1=new Isci(101," ali yilmaz");
        Isci isci2=new Isci(102," veli kaya");
        Isci isci3=new Isci(103," ayse  gul");
        Isci isci4=new Isci(104," Metin tahtaci");
        hashmap.put(isci1.getIsciId(),isci1);
        hashmap.put(isci2.getIsciId(),isci2);
        hashmap.put(isci3.getIsciId(),isci3);
        hashmap.put(isci4.getIsciId(),isci4);



        for( Map.Entry<Integer, Isci> w:hashmap.entrySet()){

            System.out.println(w.getKey());
             Isci isim =w.getValue();
             isim.display();
        }
        /*
iscilere ait isim ve kimlik numaralarinin bulundugu encapsule edilmis bir clas olusturun .
daha sonra urettiginiz objeler yardimiyla isci isimlerini ve id numaralarini yazdirin(hash map ve entry set kullanarak)


         */


    }
}
