package maps;

import java.util.HashMap;
import java.util.Scanner;

public class KimlikMap {

    static HashMap<String,String> person=new HashMap<>();
    static int a=4;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        selectOption();

    }
    static  void selectOption(){
        System.out.println("yapmak istediginiz islemi girin:\n 0: islemi sonlandir.\n1:kullanici ekle\n " +
                "2:kullanici bilgisini gor \n3:kullanici silme");

        int secim= input.nextInt();
        switch (secim){
            case 0:
                cikis();
                break;
            case 1:
                saveInfo();
                break;
            case 2:
                getInfo();
                break;
            case 3:
                removeInfo();
                break;
            default:
                System.out.println("yanlis giris yaptiniz tekrar deneyin");
                break;
        }
    }
    private static void cikis(){
        System.out.println("cikis isleminiz basari ile gerceklesti");
    }


    private static void saveInfo(){
        System.out.print("4 haneli kimlik no girin");
        String tc= input.next();
        input.nextLine();

        if(person.containsKey(tc)){
            System.out.println("zaten mevcut bir tc girdiniz. baska bir tc girin...");
            saveInfo();

        }else{
            System.out.print("adinizi girin");
            String ad= input.nextLine();

            System.out.print("soyadinizi girin");
            String soyad= input.nextLine();

            System.out.print("adresiniz girin");
            String adres= input.nextLine();

            System.out.print("tel no girin");
            String tel= input.nextLine();
            String values= ad +" "+soyad +" "+adres+" "+tel ;

            person.put(tc,values);
            System.out.println("tum verileriniz guvenli bir sekilde kaydedildi");


        }
        selectOption();


    }
    private static void getInfo(){
        System.out.print("ARADIGINIZ TC YI GIRIN");
        String aranantc= input.next();
       if(person.containsKey(aranantc)){
           System.out.println(person.get(aranantc));

       }else{
           System.out.println("bu tc ye sahip bir bilgi yok tekrar deneyin");
           getInfo();

       }
        selectOption();

    }
    private static void removeInfo(){
        System.out.print("silmek istediginiz tc yi girin");
        String silinecekTc= input.next();
        if(person.containsKey(silinecekTc)){
            person.remove(silinecekTc);
            System.out.println("tc bilgileri guvenli bir sekilde silindi");
        }else{
            System.out.println("bu tc kayitli degil tekrar deneyin");
            removeInfo();

        }
        selectOption();
    }

}
