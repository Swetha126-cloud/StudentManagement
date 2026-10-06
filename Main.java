import model.Student;
import report.StudentReport;

public class Main {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("     STUDENT MANAGEMENT SYSTEM");
        System.out.println("======================================");

        Student student1 = new Student(
                101,
                "Swetha",
                20,
                new int[]{85, 78, 90}
        );

        Student student2 = new Student(
                102,
                "Priya",
                21,
                new int[]{70, 65, 80}
        );

        Student student3 = new Student(
                103,
                "Rahul",
                20,
                new int[]{45, 50, 60}
        );

        Student[] students = {
                student1,
                student2,
                student3
        };

        StudentReport report = new StudentReport();

        for (Student student : students) {
            report.generateReport(student);
        }

        System.out.println();
        System.out.println("Application completed.");
    }
}
