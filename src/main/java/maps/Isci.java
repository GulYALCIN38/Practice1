package maps;

public class Isci {
    private int isciId;
    private String isciIsim;

    public Isci(int isciId, String isciIsim) {
        super();
        this.isciId = isciId;
        this.isciIsim = isciIsim;
    }

    public int getIsciId() {
        return isciId;
    }

    public void setIsciId(int isciId) {
        this.isciId = isciId;
    }

    public String getIsciIsim() {
        return isciIsim;
    }

    public void setIsciIsim(String isciIsim) {
        this.isciIsim = isciIsim;
    }
    public void display(){
        System.out.println("isci id="+getIsciId()+"  isci ismi"+getIsciIsim());
    }
}
