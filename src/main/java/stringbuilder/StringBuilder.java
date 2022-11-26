package stringbuilder;

public class StringBuilder {
    public static void main(String[] args) {
        int arr[] = {1551, 1223, 1443, 1267, 1789, 1023, 2020};
        int aranandeger = 1551;
        int counter = 0;
        for (int w : arr) {
            if (w == 2020) {
                counter++;
            }

        }

        if (counter != 0) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
