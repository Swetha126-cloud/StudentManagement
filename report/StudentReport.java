package report;

import model.Student;

public class StudentReport implements ReportGenerator {

    @Override
    public void generateReport(Student student) {

        System.out.println();
        System.out.println("======================================");
        System.out.println("          STUDENT REPORT");
        System.out.println("======================================");

        System.out.println("Student ID : " + student.id);
        System.out.println("Name       : " + student.name);
        System.out.println("Age        : " + student.age);

        System.out.println("--------------------------------------");

        System.out.println("Total      : " + student.calculateTotal());

        System.out.println("Average    : " + student.calculateAverage());

        System.out.println("Grade      : " + student.calculateGrade());

        if (student.isPassed()) {
            System.out.println("Result     : PASS");
        } else {
            System.out.println("Result     : FAIL");
        }

        System.out.println("======================================");
    }
}
