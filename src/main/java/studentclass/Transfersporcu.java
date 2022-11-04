package studentclass;

public class Transfersporcu extends Solacik {
    int yas;
    int maas;
    int boy;
    String ulke;
    public void sagayak(){
        System.out.println("sag ayak kullanir");
    }
    public Transfersporcu(){




    }
    public Transfersporcu(int maas){
        super(10000000,27);
        System.out.println(" para 300000");

this.maas=maas;

    }
    public Transfersporcu(int yas,int boy,String ulke){
        this.ulke=ulke;
        this.yas=yas;
        this.boy=boy;

    }

    @Override
    public void hizlikos() {
        System.out.println("hizli ve kivrak kos");
    }
}
