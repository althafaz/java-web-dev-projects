public class StudentPractice {
    public static void main(String[] args){

        Student student = new Student("Azeez", 12345, 1, 4.0);
        Teacher scienceTeacher = new Teacher("Kay", "Menon","Biology",2);
        Course biology = new Course("Biology","Science",scienceTeacher);
        biology.addStudent(student);
        System.out.println(biology.getEnrolledStudents().get(0).getName());

    }
}
