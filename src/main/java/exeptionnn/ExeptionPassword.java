package exeptionnn;

import java.util.Scanner;

public class ExeptionPassword {
    static String password="2345yuu";
    public static void main(String[] args) {
        //kullanici paswordunu database den kontrol edip finaly ile baglantiyi
        // kesen bizim olusturdugumuz bir methot
        try{
            f3();
        }catch(RuntimeException e){
            System.out.println(e.getMessage());

        }finally{
            System.out.println("baglanti kesildi");
        }
    }
    public static void f3(){
        Scanner input = new Scanner(System.in);
        System.out.println("pasvord gir");
        String pass= input.next();
        if(!pass.equals(password)){
            throw new PassExeption("PASSWORD YANLIS");
        }else{
            System.out.println("pasvord basarili");
        }

    }
}
