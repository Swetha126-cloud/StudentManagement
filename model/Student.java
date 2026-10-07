package model;

import exception.InvalidMarksException;

public class Student {

    public int id;
    public String name;
    public int age;
    public int[] marks;

    public Student(int id, String name, int age, int[] marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int calculateTotal() throws InvalidMarksException {

        int total = 0;

        for (int mark : marks) {

            if (mark < 0 || mark > 100) {
                throw new InvalidMarksException(
                        "Invalid mark: " + mark
                );
            }

            total += mark;
        }

        return total;
    }

    public double calculateAverage() throws InvalidMarksException {

        return calculateTotal() / (double) marks.length;
    }

    public char calculateGrade() throws InvalidMarksException {

        double average = calculateAverage();

        if (average >= 90) {
            return 'A';
        } else if (average >= 75) {
            return 'B';
        } else if (average >= 60) {
            return 'C';
        } else if (average >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public boolean isPassed() throws InvalidMarksException {

        return calculateAverage() >= 40;
    }
}