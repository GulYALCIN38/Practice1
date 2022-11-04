package studentclass;

public class Solacik extends Futbolcu {
    int yas;
    int bonservis;
    int boy;

    public void hizlikos() {
        System.out.println("hizli kosabilir");

    }

    public Solacik() {

    }

    public Solacik(int yas) {
        super("cek");
        this.yas = yas;
        System.out.println("solaciktan yas");
    }

    public Solacik(int bonsevis, int boy) {
        this(27);
        this.bonservis=bonsevis;
        this.boy=boy;
        System.out.println("solaciktan bonservis boy");

    }
}
