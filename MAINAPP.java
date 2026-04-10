public class MainApp {

    public static void main(String[] args) {

        Course course = new Course("Computer Science", "CS101");

        Student student = new Student(101, "Edna", course.getCourseName(), 75);

        System.out.println("=== STUDENT MANAGEMENT SYSTEM ===");
        course.displayCourse();
        System.out.println("----------------------------");
        student.displayDetails();
    }
}