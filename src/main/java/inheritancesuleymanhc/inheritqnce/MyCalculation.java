package inheritancesuleymanhc.inheritqnce;

public class MyCalculation  extends Calculation{
    public void carpma(int x, int y){
        System.out.println(super.buyuksayi);
        z=x*y;
        System.out.println(z);
    }
    public void bolme(int x, int y){
        super.toplama(14,90);
        z=x/y;
        System.out.println(z);
    }
    public static void main(String[] args) {
//        Calculation cal= new Calculation();
//        cal.toplama(25,13);
//        cal.cikarma(25,13);
        MyCalculation demo= new MyCalculation();
        demo.toplama(5,7);
        demo.cikarma(7,3);
        System.out.println("===================>");
        demo.carpma(3,6);
        demo.bolme(9,1);
        System.out.println(demo.buyuksayi);
    }

}
