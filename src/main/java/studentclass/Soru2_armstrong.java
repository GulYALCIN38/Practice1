package studentclass;

public class Soru2_armstrong {
    public static void main(String[] args) {
        // armstrong sayi olup olmadig

        int n =193;
        int sumofcub=0;
        int temp=n;
        int digit =0;
        while(n>0){
            digit=n%10;
            sumofcub+=digit*digit*digit;




            n=n/10;
        }
        if(sumofcub==temp){
            System.out.println(" armstrongdur");
        }else{System.out.println(" armstrongdur degil");}
    }
}
