package problem3.student;

public class Student {
    private int rollNo;
    private String name;

    public Student(int rollNo) {
        this.rollNo = rollNo;
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}
