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

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return rollNo + "." + name;
    }

    @Override
    public boolean equals(Object obj) {
        boolean flag = false;
        Student student = (Student) obj;
        if (rollNo > student.rollNo) {
            return true;
        }
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return flag;
    }
}
