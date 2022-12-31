package studentclass.seyma.constractor;

public class Main {
    public static void main(String[] args) {
        //Product product=new Product();
        Product or=new Product(1,"tablet","netboouk",1200,7,"gri","34");
//        product.setId(1);
//        product.setName("laptop");
//        product.setDescription("mavbook");
//        product.setPrice(15000);
//        product.setStockAmound(5);
//        product.setColour("gri");
//        product.setCode("523");
        System.out.println(or.getName());

                ProductMeneger productMeneger=new ProductMeneger();
                productMeneger.add();
    }
}
