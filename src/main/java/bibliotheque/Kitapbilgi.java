package bibliotheque;

public class Kitapbilgi {
    public String kitapAdi;
    public String yazarAdi;
    public double fiyati;

    public Kitapbilgi(String kitapAdi, String yazarAdi, double fiyati) {
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.fiyati = fiyati;
    }

    @Override
    public String toString() {
        return "Kitapbilgi{" +
                "kitapAdi='" + kitapAdi + '\'' +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", fiyati=" + fiyati +
                '}';
    }
}
