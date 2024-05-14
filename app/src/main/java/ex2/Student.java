package ex2;

public class Student {
    public String name;
    public String major;
    public Course[] courses;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Name: %s%nMajor: %s%nCourses: %n".formatted(name, major));
        for (Course course : courses) {
            sb.append("- ")
              .append(course.toString())
              .append("\n");
        }
        return sb.toString();
    }
}
