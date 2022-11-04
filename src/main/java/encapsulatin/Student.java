package encapsulatin;

public class Student {
    public String name="tom hanks";
    private String id ="oriu8676";
    private double gpa =3.8;
    private boolean retired=false;

    public String getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
