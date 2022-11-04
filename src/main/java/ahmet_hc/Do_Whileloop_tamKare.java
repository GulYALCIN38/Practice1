package ahmet_hc;

public class Do_Whileloop_tamKare {
    public static void main(String[] args) {
       // kullanicdan bir pozitif sayi isteyin ve sayinin tam kare olup olmadigina bakin

        int init=120;
        int bas=1;
        int counter=0;
        do{
            if(bas*bas==init) {
                System.out.println("sayi tam karedir");
                counter++;
                break;
            }

         bas++;

        }while(bas*bas<=init);
        if(counter==0){
            System.out.println("sayi tamkare degil");
        }



        int a=9;

        System.out.println(tamkaremi(161));

    }
    public static int tamkaremi(int a){

        int sonuc=0;
        for(int i=1; i*i<=a;i++){
            if (i*i==a){

                sonuc=1;
                break;


            }


        }

        return sonuc;
    }
}
