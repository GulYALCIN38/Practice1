package ahmet_hc;

import java.util.Scanner;

public class Do_While_Loop {
    public static void main(String[] args) {
        int counter=0;
        boolean gecerlimi=false;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println(" lutfen bir sifre girin");
            String s= input.next();
            counter=0;
            if( s.replaceAll("[a-z]","").length()==s.length()){
                counter++;
                System.out.println("sifre kucuk harf icermeli");
            }

           if(s.replaceAll("[A-Z]","").length()==s.length()){
               counter++;
               System.out.println("sifre BUYUK harf icermeli");

           }
           if(s.replaceAll("\\W","").length()==s.length()){
               counter++;
               System.out.println("sifre OZEL KARAKTER  icermeli");

           }
           if(s.length()<8){
               counter++;
               System.out.println("sifre 8 KARAKTER  icermeli");

           }

if(counter==0){
    gecerlimi=true;
    System.out.println("sifre basatili");
}

        }while(gecerlimi=false);


    }

}
