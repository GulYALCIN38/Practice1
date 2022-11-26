package maps;

public class Hayvanlar {

    public int yas;
    public String isim;
    public String yasamalani;
    public boolean karadami;

    public Hayvanlar(int yas, String isim, String yasamalani, boolean karadami) {
        this.yas = yas;
        this.isim = isim;
        this.yasamalani = yasamalani;
        this.karadami = karadami;
    }


    @Override
    public String toString() {
        return "Hayvanlar{" +
                "yas=" + yas +
                ", isim='" + isim + '\'' +
                ", yasamalani='" + yasamalani + '\'' +
                ", karadami=" + karadami +
                '}';
    }
}
