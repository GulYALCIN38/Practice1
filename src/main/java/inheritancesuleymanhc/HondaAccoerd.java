package inheritancesuleymanhc;

public class HondaAccoerd extends Honda {
    public int price;
    public int year;
    public String model;
    public String make;

    public HondaAccoerd() {

    }

    public HondaAccoerd(int price) {
        this.price = price;

    }

    public HondaAccoerd(int price, int year) {

        this.price = price;
        this.year = year;
        System.out.println(" hondaaccord  costracter");


    }

    public HondaAccoerd(int price, int year, String make, String model) {
        this.price = price;
        this.year = year;
        this.make=make;
        this.model=model;

    }

}
