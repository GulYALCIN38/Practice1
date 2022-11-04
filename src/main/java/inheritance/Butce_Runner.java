package inheritance;

public class Butce_Runner {
    public static void main(String[] args) {
        Butce baba = new Butce();
        System.out.println(Butce.butce);
        baba.maasAl(5000);
        System.out.println(Butce.butce);
        System.out.println(baba.harclik);
        baba.harclikal(500);
        baba.harclikharca(266);
        baba.butcedenharca(3000);
        baba.butcedenharca(1000);
        Butce anne = new Butce();
        anne.maasAl(5000);
        anne.harclikal(2000);
        anne.harclikharca(300);
        System.out.println("butce=" + Butce.butce);
        System.out.println("harclik=" + baba.harclik);
        System.out.println(anne.harclik);

    }
}
