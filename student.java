class Student extends Person {

    private String studentId; // CHANGE int → String
    private String course;
    private int marks;

    // Constructor
    public Student(String studentId, String name, String course, int marks) {
        super(name);
        this.studentId = studentId;
        this.course = course;
        this.marks = marks;
    }

    // Getters and Setters
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public int getMarks() { return marks; }
    public void setMarks(int marks) { this.marks = marks; }

    // Calculate Grade
    public String calculateGrade() {
        if (marks >= 70) return "A";
        else if (marks >= 60) return "B";
        else if (marks >= 50) return "C";
        else if (marks >= 40) return "D";
        else return "Fail";
    }

    // Override displayDetails
    @Override
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("---------------------------");
    }
}