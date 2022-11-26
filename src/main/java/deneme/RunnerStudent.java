package deneme;

public class RunnerStudent {
    public static void main(String[] args) {
        Student s=new Student("ayse", 20);

        System.out.println(s.age);
        System.out.println(s.name);
        Student s1=new Student(17);
        System.out.println(s1.age);
        System.out.println(s1.name);

    }
}
