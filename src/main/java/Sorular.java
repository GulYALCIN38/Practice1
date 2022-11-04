import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

 /*
 Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
 Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o noktadan sonra sürekli azalan Array.
  */

public class Sorular {
    public static void main(String[] args) {
        int[] arr = {-999, 1, 2, 5, 7, 9, 22, 8, 3, 1, -100};
        List<Integer> list = new ArrayList<>();
        for (int w : arr) {
            list.add(w);

        }
        System.out.println(list);
        int max = arr[0];
        for (int k : arr) {
            if (max < k) {
                max = k;

            }


        }
        System.out.println(max);

        List<Integer>list1=new ArrayList<>();
        for (Integer w:list) {
            if (w==max){
                break;

            }
            list1.add(w);

        }
        System.out.println("list1 = " + list1);
        //Collections.sort(list1);
        List<Integer> list2 = new ArrayList<>();

        for(int i = 0; i<list.size(); i++){
            if(i<list.indexOf(max)){
                continue;
            }
            list2.add(arr[i]);

        }
        System.out.println("list2 = " + list2);
        List<Integer>list1copy=new ArrayList<>(list1);
        System.out.println(list1copy);
        Collections.sort(list1copy);
        
        List<Integer>list2copy=new ArrayList<>(list2);
        System.out.println("list2copy = " + list2copy);
        Collections.sort(list2copy);
        Collections.reverse(list2copy);



        if(list1copy.equals(list1)&&list2copy.equals(list2)){
            System.out.println("mountain array");

        }else{
            System.out.println("mountain array degil");
        }


        
    }
}
