package exeption;

public class ExeptionThrow {
    //yasi ekrana yazdiran bir methot olusturun
    public static void main(String[] args) {

        int age=25;
        try {
            printage(age);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        }


    public static void printage(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("yas NEGATIF OLMAZ");

        }
        System.out.println(age);
    }
}
