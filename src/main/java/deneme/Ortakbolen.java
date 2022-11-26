package deneme;

import java.util.ArrayList;
import java.util.List;

public class Ortakbolen {
    //iki sayinin ortak bolenlerini listeleyen bir methot olusturun
    public  List ortakBolenleriBul(int a, int b){
        int min=Math.min(a,b);
        List<Integer> list= new ArrayList<>();
        for (int i = 1; i <=min ; i++) {
            if(a%i==0&&b%i==0){
                list.add(i);
            }

        }

        return list;

    }

}
