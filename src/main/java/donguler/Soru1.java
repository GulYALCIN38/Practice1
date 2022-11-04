package donguler;

public class Soru1 {
    public static void main(String[] args) {
        /*

EX1=String s = "aaaabbbbcddff"; boyle bir stringte harflerin tekrar sayisini gosteren kodu yazin
ornegin==>4a4b1c2d2f

*/
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;




        String s = "aaaabbbbcddff";
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='a'){
                a++;
            }
            if(ch=='b'){
                b++;
            }
            if(ch=='c'){
                c++;
            }
            if(ch=='d'){
                d++;
            }
            if(ch=='f'){
                f++;
            }

        }
        System.out.println(a+"a"+b+"b"+c+"c"+d+"d"+f+"f");


    }
}
