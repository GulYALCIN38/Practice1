package encapsulatin;

public class Studentrunner {
    public static void main(String[] args) {
        Student s1= new Student();

        s1.setId("uyt");
        s1.setGpa(4.7);
        s1.setRetired(false);
        System.out.println(s1.getId());
        System.out.println(s1.getGpa());
        System.out.println(s1.isRetired());

    }

}
