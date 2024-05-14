package ex2;

public class Course {
    public String courseName;
    public double courseGrade;

    @Override
    public String toString() {
        return courseName + ": " + courseGrade;
    }
}
