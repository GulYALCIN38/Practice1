package studentclass.seyma.constractor;

public class ConsructorOkul {
    int numara;
    String adi;
    int yas;

    public ConsructorOkul(int numara, String adi, int yas) {
        this.numara = numara;
        this.adi = adi;
        this.yas = yas;
    }
    void goster(){
        System.out.println( numara+adi+yas );
    }

    public static void main(String[] args) {
        ConsructorOkul obj=new ConsructorOkul(2345,"ali",25);
        obj.goster();
        System.out.println(obj.adi);
    }
}
