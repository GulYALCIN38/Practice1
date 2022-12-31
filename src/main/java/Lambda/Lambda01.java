package Lambda;

import java.util.stream.IntStream;

public class Lambda01 {
    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
//TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
//TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
//TASK 05 --> 2'nin ilk pozitif x kuvvetini ekrana yazdiran programi  create ediniz.
//TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void main(String[] args) {
        System.out.println(ciftTopla(3));
        ikikuvvet(4);
        System.out.println();
        istenen(3,4);

    }
    public static int cift(int x){
       return IntStream.rangeClosed(2,x).filter(t->t%2==0).sum();
    }
    public  static int ciftTopla(int a){
      return   IntStream.iterate(2,t->t+2).limit(a).sum();
    }
    public  static void ikikuvvet(int a){
        IntStream.iterate(2,t->t*2).limit(a).forEach(t-> System.out.print(t+" "));
    }
    public  static void istenen(int istenen ,int a){
        IntStream.iterate(istenen,t->t*istenen).limit(a).forEach(t-> System.out.print(t+" "));
    }

}
