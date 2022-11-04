package inheritancesuleymanhc;

public class Honda extends Car {
    public String color;
    public Honda() {
        super("white",54000);
        System.out.println(" hondaa costracter");
    }
    public Honda(String color) {
        this.color=color;
    }
}
