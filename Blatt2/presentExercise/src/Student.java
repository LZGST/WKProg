import java.util.ArrayList;

public class Student extends Person{
    private int matNumber;
    private int semester;
    private ArrayList<String> courses;

    public Student(String firstName, String lastName, int age, int matNumber, int semester) {
        super(firstName, lastName, age);
        this.matNumber = matNumber;
        this.semester = semester;
    }

    public void addCourse(String course) {
        if (courses == null) {
            courses = new ArrayList<>();
        }
        courses.add(course);
    }

    public void printCoursesList() {
        if (courses != null && !courses.isEmpty()) {
            System.out.println("Courses: " + String.join(", ", courses));
        } else {
            System.out.println("No courses enrolled.");
        }
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder(super.getInfo());
        info.append(", Matriculation Number: ").append(matNumber);
        info.append(", Semester: ").append(semester);
        if (courses != null && !courses.isEmpty()) {
            info.append(", Courses: ").append(String.join(", ", courses));
        } else {
            info.append(", No courses enrolled.");
        }
        return info.toString();
    }

    public int getMatNumber() {
        return matNumber;
    }

    public void setMatNumber(int matNumber) {
        this.matNumber = matNumber;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }
}
