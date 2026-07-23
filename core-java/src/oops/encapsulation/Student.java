package oops.encapsulation;

public class Student extends Person {
    private String degree;
    private String college;

    public Student() {

    }

    public Student(String degree, String college) {
        this.degree = degree;
        this.college = college;
    }

    public Student(String username, String password, String degree, String college) {
        super(username, password);
        this.degree = degree;
        this.college = college;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDegree() {
        return degree;
    }

    public String getCollege() {
        return college;
    }
}
