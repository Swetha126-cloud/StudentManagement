package model;

public class Student {

    public int id;
    public String name;
    public int age;
    public int[] marks;

    // Constructor
    public Student(int id, String name, int age, int[] marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Calculate total
    public int calculateTotal() {

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    // Calculate average
    public double calculateAverage() {

        return calculateTotal() / (double) marks.length;
    }

    // Calculate grade
    public char calculateGrade() {

        double average = calculateAverage();

        if (average >= 90) {
            return 'A';
        } 
        else if (average >= 75) {
            return 'B';
        } 
        else if (average >= 60) {
            return 'C';
        } 
        else if (average >= 40) {
            return 'D';
        } 
        else {
            return 'F';
        }
    }

    // Check result
    public boolean isPassed() {

        return calculateAverage() >= 40;
    }
}
