import model.Student;
import report.StudentReport;

public class Main {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("        STUDENT MANAGEMENT SYSTEM");
        System.out.println("==============================================");

        // Creating multiple students

        Student student1 = new Student(
                101, "Swetha", 20,
                new int[]{85, 78, 90}
        );

        Student student2 = new Student(
                102, "Priya", 21,
                new int[]{70, 65, 80}
        );

        Student student3 = new Student(
                103, "Rahul", 20,
                new int[]{45, 50, 60}
        );

        Student student4 = new Student(
                104, "Arun", 21,
                new int[]{92, 88, 95}
        );

        Student student5 = new Student(
                105, "Divya", 20,
                new int[]{55, 68, 72}
        );

        Student student6 = new Student(
                106, "Karthik", 22,
                new int[]{76, 82, 79}
        );

        Student student7 = new Student(
                107, "Anitha", 20,
                new int[]{88, 91, 86}
        );

        Student student8 = new Student(
                108, "Vijay", 21,
                new int[]{35, 42, 38}
        );

        Student student9 = new Student(
                109, "Meena", 20,
                new int[]{67, 73, 69}
        );

        Student student10 = new Student(
                110, "Dinesh", 22,
                new int[]{95, 94, 98}
        );


        // Store all students in an array

        Student[] students = {
                student1,
                student2,
                student3,
                student4,
                student5,
                student6,
                student7,
                student8,
                student9,
                student10
        };


        // Create report object

        StudentReport report = new StudentReport();


        // Generate report for every student

        for (Student student : students) {
            report.generateReport(student);
        }


        // Final message

        System.out.println();
        System.out.println("==============================================");
        System.out.println("       ALL STUDENT REPORTS GENERATED");
        System.out.println("==============================================");
    }
}
