package studentclass;

public class Futbolcu extends Sporcu {
    String ulke;
    int boy;
    int bonservis;
    int maas;

    public void futbolOyna() {
        System.out.println("futbol oynar");
    }

    public Futbolcu() {

    }

    public Futbolcu(String ulke) {
        super("futbol");
        this.ulke = ulke;
        System.out.println("futbolcudan ulke");

    }

    public Futbolcu(int maas, int bonservis) {
        this.maas = maas;
        this.bonservis = bonservis;

    }

    public Futbolcu(String ulke, int bonservis, int maas, int boy) {

        this.maas = maas;
        this.bonservis = bonservis;
        this.ulke = ulke;
        this.boy = boy;
        System.out.println("naber");

    }
}
