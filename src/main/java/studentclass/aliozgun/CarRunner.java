package studentclass.aliozgun;

public class CarRunner {
    public static void main(String[] args) {
        Car fero=new Car();
        System.out.println(fero.marka);
        String str=fero.marka.replace("ferrari","sahin");
        System.out.println(str);

        System.out.println(fero.getFiyat());
        fero.setFiyat(5000000);
        System.out.println(fero.getFiyat());
        System.out.println(fero.isMutlumu());
    }
}
