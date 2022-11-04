package mustafaatci;

public class Soru2_sayi3ussumu {
    /*
    bir sayi verildiginde 3 un ussu ise true dondur
     */
    public static void main(String[] args) {
        System.out.println(ucunUssumu(20));


    }
    public static boolean ucunUssumu(int a){
        boolean ucuss=false;
        for(int i=1;i<a;i++){

           if(i*i*i==a) {
                ucuss=true;
                break;

           }else{ucuss=false;}
        }
        return ucuss;
    }
}
