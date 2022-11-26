package inheritancesuleymanhc.inheritqnce;

public class Child extends Parent{
    Child(){
        System.out.println("child parametresiz");
    }
    Child(int d){
        super(23);
        System.out.println("child  1 parametreli");
    }
    Child(int s,int y){
        super(13,24);
        System.out.println("child  2 parametreli");
    }
    public static void main(String[] args) {
        Child ch=new Child(12);
        Child ch2=new Child(12,14);
    }
}
