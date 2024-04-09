import java.util.ArrayList;

public class Course {

        private  String name;
        private String department;
        private Teacher instructor;
        private ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Course(String name, String department, Teacher instructor) {
        this.name = name;
        this.department = department;
        this.instructor = instructor;
    }

    public void addStudent (Student student){
        enrolledStudents.add(student);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}
