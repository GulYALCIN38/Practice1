import java.util.Arrays;
import java.util.Scanner;

public class Exeption {
    public static void main(String[] args) {
        // verilen string arraydaki kodu urunu elde et
        String  str = "lskjd";
        Scanner input = new Scanner(System.in);
        String [] arr={"elma","armut"," kiraz"};
        System.out.println(Arrays.toString(arr));
        System.out.println(" bir sura no gir");
        int sirano;
        try{
             sirano= input.nextInt();
            System.out.println(arr[sirano]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println();
        }



    }
}
