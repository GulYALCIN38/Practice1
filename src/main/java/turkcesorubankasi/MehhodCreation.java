package turkcesorubankasi;

public class MehhodCreation {
    public static void main(String[] args) {

        String isim= "LulA";
        String soyisim= "gulenaz";

        System.out.println(isimSoyisim(isim, soyisim));

    }

    public static String isimSoyisim(String isim,String soyisim){

String yeniis=isim.substring(0,1).toUpperCase()+isim.substring(1,isim.length()).toLowerCase();
String yenisoy=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1,soyisim.length()).toLowerCase();
String yeniisimsoyisim=yeniis +" "+yenisoy;
return yeniisimsoyisim ;
    }
}
