public class StudentManagementSystem {

    public static void main(String[] args) {

        // Create student objects with string IDs
        Student student1 = new Student("BSE_01_0062/2026", "Edna Nyokabi", "OOP", 78);
        Student student2 = new Student("BSE_01_0095/2025", "Brian Kimani", "Database", 55);
        Student student3 = new Student("BSE_01_0106/2026", "Alice Wanjiku", "Networking", 65);

        // Display details
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}