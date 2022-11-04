package studentclass.seyma;

public class Array_list {
    public static void main(String[] args) {
         /*
        Asagidaki diziler göz önüne alindiginda:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
         1. "Eldivenler" in ilk dizin numarasını bulun
         2. öğe listesinde "iPad"in bulunup bulunmadığını öğrenin
         3. Her alışveriş öğesinin raporunu yazdırın
             isim - fiyat - #ID
     */

        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        for (int i = 0; i < itemIDs.length; i++) {
            String itemsName = items[i];
            double pricesOf = prices[i];
            int itemsId = itemIDs[i];
            if (items[i].equals("Gloves")) {
                System.out.println("index gloves ="+i);
            }
            if(items[i].equals("iPad")){
                System.out.println(" ipad var");

            }
            System.out.println("isim="+ items[i]+" fiyat=" +prices[i]+ " id=" +itemsId);
            }


    }
    }




