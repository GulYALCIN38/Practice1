package donguler;

import java.util.Scanner;

public class Soru_4 {
    static int x;
    int y;

       Soru_4() {
        x += 2;
        y++;

    }
    static int getSquare(){
        return x*x;
    }

    public static void main(String[] args) {
           Soru_4 s1= new Soru_4();
           Soru_4 s2= new Soru_4();
           int z=s1.getSquare();
        System.out.println("-x"+z+"-y"+s2.y);

    }
}





