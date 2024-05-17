package InterfaceComparableExample;

public class Student implements Comparable<Student> {
    private static int id = 0;
    private int studentNum;
    private boolean activeStatus;
    private String name;

    public Student(String name) {
        this.name = name;
        this.activeStatus = true;
        this.studentNum = id;
        id++;
    }

    public void deactiveStudentStatus() {
        this.activeStatus = false;
    }

    public void activateStatus() {
        this.activeStatus = true;
    }

    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }
    public String toString() {
        return String.format("%6d %10s%n", this.studentNum, this.name);
    }
}
