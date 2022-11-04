package mustafaatci;

public class Soru1_SansLoopsayiyazdirma {
    // loop kullanmadan 1 den 100 e yazdir
    public static void main(String[] args) {
        yazdir(1);

    }
    public static void yazdir(int sayi){
        if(sayi<100){
            System.out.print(sayi+" ");
            yazdir(sayi+1);
        }
    }
}
