package turkcesorubankasi;


import java.util.Scanner;

public class MethodCreation {
    public static void main(String[] args) {

String input="guzel lale";
int bas=5;
int bitis=7;

kendiSubstring("guzel lale",4,7
);

    }
public static void kendiSubstring(String input,int bas,int bitis){
        if(bas>bitis){
            System.out.println("bitis index daha buyuk olamaz");
        } else if (bitis>input.length()-1) {
            System.out.println("bitis indexi string ten buyuk");

        }else{
            for(int i=0;i<input.length();i++){
                if(i>=bas&&i<bitis){
                    System.out.print(input.substring(i, i + 1));
                }

            }
            System.out.println();
        }
}

}

