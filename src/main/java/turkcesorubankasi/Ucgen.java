package turkcesorubankasi;

public class Ucgen {
    public static void main(String[] args) {
        for (int i = 1; i <=6 ; i++) {
            for (int j = i; j <= 6; j++) {
                System.out.print(" ");
            }
            for (int m = 1; m <=i ; m++) {
                System.out.print("*"+" ");

            }
            System.out.println();

        }
    }
}
