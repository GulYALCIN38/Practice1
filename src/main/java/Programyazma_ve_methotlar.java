import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programyazma_ve_methotlar {
    // 1 - Verilen Sayinin Fonksiyon Degerini Bulma (5! = 1*2*3*4*5;)
// 2 - Verilen Sayi Kadar Fibonacci Yazdirma (1, 1, 2, 3, 5, 8, 13, 21, 34, 55)
// 3 - Mukemmel Sayi mi (Bir Sayinin bolenlerinin toplami kendine esitese mukemmel sayidir (1+2+3 = 6)(28, 496 vs)
// 4 - Verilen Sayi Asal Sayi mi ? (1 ve kendisinden baska sayiya bolunemeyen sayilar)
// 5 - Verilen Sayinin KareKokunu Bulma
// 6 - Verilen Iki Sayinin Ortak Bolenlerini Listeleme
// 0  - Cikis icin 0'i secin

    public static void main(String[] args) {
        System.out.println("lutfen yapmak istediginiz islemi secin\n" + "*".repeat(30) + "\n " +
                "1\tFonksiyon bulma\n2\tfibonacci\n3\tmukemmel sayi\n4\tasal sayimi\n5\tkarekok bulma\n6\tortak bolenler\n0\t cikis yap");
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("yapmak istediginiz islemi girin");

            int islem = input.nextInt();
            if (islem == 0) {
                System.out.println("programdan cik yavrumm");
                break;
            }

            switch (islem) {
                case 1:
                    System.out.println("lutfen 20 den kucuk sayi gir");
                    int s = input.nextInt();
                    System.out.println(faktoriyel(s));
                    break;
                case 2:
                    System.out.println("fibonacci icin bir uzunluk girin ");
                    int e = input.nextInt();
                    fibonacci(e);
                    break;
                case 3:
                    System.out.println("bir sayi girin  mukemmel mi bakak ");
                    int p = input.nextInt();
                    mukemmelSayi(p);
                    break;

                case 4:
                    System.out.println("bir sayi girin asal mi bakalim beybi ");
                    int n = input.nextInt();
                    asalSayiMi(n);
                    break;
                case 5:
                    System.out.println("bir sayi gir karekok bulcammm ");
                    int o = input.nextInt();
                    karekokbul(o);
                    break;
                case 6:
                    System.out.println("iki sayi girin ortak bolenleri bulam anam anam anam ");
                    int x = input.nextInt();
                    int y = input.nextInt();
                    ortakbolenleribul(x, y);
                    break;
                default:
                    System.out.println("gecersiz islem");


            }
        } while (true);


    }

    public static int faktoriyel(int a) {
        int carpim = 1;
        for (int i = a; i > 0; i--) {
            carpim *= i;

        }
        return carpim;
    }

    public static void fibonacci(int a) {
        int x = 1;
        int y = 1;
        int f = 0;
        System.out.print(x + " ");
        System.out.print(y + " ");
        for (int i = 1; i < a - 1; i++) {
            f = x + y;
            System.out.print(f + " ");

            x = y;
            y = f;

        }
        System.out.println();


    }

    public static void mukemmelSayi(int a) {
        int toplam = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                toplam += i;
            }
        }
        if (a == toplam) {
            System.out.println("Bu Mukemmel Bir Sayi");
        } else System.out.println("Bu Kusurlu Bir Sayi");
    }

    public static void asalSayiMi(int a) {
        boolean asal = false;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                asal = true;
            }
        }
        if (asal) {
            System.out.println("asal degil");
        } else {
            System.out.println("asal");
        }

    }

    public static void karekokbul(int a) {
        double karekok = Math.sqrt(a);
        NumberFormat numberFormat = new DecimalFormat(".##");
        System.out.println(numberFormat.format(karekok));
    }

    public static void ortakbolenleribul(int a, int b) {
        List<Integer> list = new ArrayList<>();
        int kucuk = Math.min(a, b);
        for (int i = 1; i < kucuk; i++) {
            if (a % i == 0 && b % i == 0) {

                list.add(i);

            }
        }
        System.out.println("list = " + list);
    }

}
