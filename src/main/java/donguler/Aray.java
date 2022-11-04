package donguler;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/* TASK :
 * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
 * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
 * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
 * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
 *
 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
 * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
 * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
 * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
 * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
 * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
 * 			 ortalama kazançtan yüksekse o günleri return yap.
 * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
 * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
 * 			 ortalama kazançtan aşağıysa o günleri return yap.
 * */

public class Aray {

    static List<String> gunler = new ArrayList<>(Arrays.asList(" Pazartesi", " Sali", " Carsamba", " Persembe", " Cuma", " Cumartesi", " Pazar"));
    static List<Double> gunlukKazanc = new ArrayList<>();
    static double ciro = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 7) {

            System.out.println(gunler.get(i) + " gununun kazancini gir");
            double kazanc = input.nextDouble();
            gunlukKazanc.add(kazanc);
            ciro += kazanc;
            i++;
        }
        System.out.println("gunlik ortalama kazanc="+new DecimalFormat("##,##").format(gunlukOrtalamaKazanc(ciro)));

        System.out.println(gunlukOrtalamaustu());
        System.out.println(gunlukOrtalamaAlti());

    }

    public static double gunlukOrtalamaKazanc(double a) {
        double ortalama = a / 7;
        return ortalama;
    }

    public static String gunlukOrtalamaAlti() {
        String ortaltigunler = "";
        for (int i = 0; i < 7; i++) {
            if (gunlukKazanc.get(i) < gunlukOrtalamaKazanc(ciro)) {
                ortaltigunler += gunler.get(i);

            }


        }
        return ortaltigunler;

    }
    public static String gunlukOrtalamaustu() {
        String ortaustugunler = "";
        for (int i = 0; i < 7; i++) {
            if (gunlukKazanc.get(i) > gunlukOrtalamaKazanc(ciro)) {
                ortaustugunler += gunler.get(i);

            }


        }
        return ortaustugunler;

    }

}
