package studentclass.seyma.constractor;

public class Okul {
    int numara;
    String adi;
    int yasi;

    void goster() {
        System.out.println(numara + " " + adi + " " + yasi);
    }

    public static void main(String[] args) {
        Okul okul1=new Okul();
okul1.goster();//0 null 0
    }
}
