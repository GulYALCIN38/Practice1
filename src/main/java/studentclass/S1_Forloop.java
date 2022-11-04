package studentclass;

public class S1_Forloop {
     static String ters = "";

    public static void main(String[] args) {
        String s = "anna";
        palindrom( "anna");



    }

    public static void palindrom(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            ters += s.substring(i, i + 1);

        }

        if (ters.equals(s)){
            System.out.println("palindrom");
    }else{
        System.out.println("palindrom degil");
    }
}}

