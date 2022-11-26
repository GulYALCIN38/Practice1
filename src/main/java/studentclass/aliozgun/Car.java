package studentclass.aliozgun;

public class Car {
    public String marka="ferrari";
    public String model="F488 GTB";
    private String guc="670";
    private int fiyat=209900;
    public String renk="kirmizi";
    private boolean mutlumu=true;

    public String getGuc() {
        return guc;
    }

    public void setGuc(String guc) {
        this.guc = guc;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }





    public boolean isMutlumu() {
        return mutlumu;
    }

    public void setMutlumu(boolean mutlumu) {
        this.mutlumu = mutlumu;
    }
}
