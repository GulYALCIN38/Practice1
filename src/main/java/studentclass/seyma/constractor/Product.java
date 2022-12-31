package studentclass.seyma.constractor;

public class Product {
    public Product() {
        System.out.println("yapici metht calisti");
    }

    public Product(int id, String name, String description, double price, int stockAmound, String colour, String code) {
        System.out.println(" parametreli methot cakistu");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmound = stockAmound;
        this.colour = colour;
        this.code = code;
    }

    int id;
    String name;
    String description;
   double price;
   int stockAmound;
   String colour;
   String code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmound() {
        return stockAmound;
    }

    public void setStockAmound(int stockAmound) {
        this.stockAmound = stockAmound;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
