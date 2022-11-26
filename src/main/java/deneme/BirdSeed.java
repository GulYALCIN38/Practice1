package deneme;

public class BirdSeed {
    private int numberBags;
    boolean call;
    double y=8.0;
    public BirdSeed() {
        this.numberBags = 11;
        call = false;
    }
    public BirdSeed(int numberBags) {
        this.numberBags = numberBags;
        this.call = true;
    }
    public static void main(String[] args) {
        BirdSeed seed = new BirdSeed(7);
        System.out.println(seed.call);
        System.out.println(seed.y);
    }

}
