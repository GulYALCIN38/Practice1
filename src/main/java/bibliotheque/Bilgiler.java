package bibliotheque;

public class Bilgiler {
   private String kitapadi;
    private String yazaradi;
    private double fiyati;

    public Bilgiler() {

    }

    public Bilgiler(String kitapadi, String yazaradi, double fiyati) {
        this.kitapadi = kitapadi;
        this.yazaradi = yazaradi;
        this.fiyati = fiyati;
    }

    public String getKitapadi() {
        return kitapadi;
    }

    public void setKitapadi(String kitapadi) {
        this.kitapadi = kitapadi;
    }

    public String getYazaradi() {
        return yazaradi;
    }

    public void setYazaradi(String yazaradi) {
        this.yazaradi = yazaradi;
    }

    public double getFiyati() {
        return fiyati;
    }

    public void setFiyati(double fiyati) {
        this.fiyati = fiyati;
    }

    @Override
    public String toString() {
        return "Bilgiler{" +
                "kitapadi='" + kitapadi + '\'' +
                ", yazaradi='" + yazaradi + '\'' +
                ", fiyati=" + fiyati +
                '}';
    }
}
