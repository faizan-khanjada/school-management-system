package model;

/**
 * Represents a student and stores academic and attendance details.
 */
public class Student extends Person {
    private String className;
    private double[] grades;
    private int attendance;
    private int gradeCount;

    public Student(int id, String name, int age, String className) {
        super(id, name, age);
        this.className = className;
        this.grades = new double[10];
        this.attendance = 0;
        this.gradeCount = 0;
    }

    /**
     * Adds a grade to the student if capacity allows.
     */
    public void addGrade(double grade) {
        if (gradeCount < grades.length) {
            grades[gradeCount++] = grade;
        } else {
            System.out.println("Cannot add more grades. Limit reached.");
        }
    }

    /**
     * Marks one day of attendance for the student.
     */
    public void markAttendance() {
        attendance++;
    }

    /**
     * Calculates the average grade.
     */
    public double getAverageGrade() {
        if (gradeCount == 0) return 0.0;

        double sum = 0.0;
        for (int i = 0; i < gradeCount; i++) {
            sum += grades[i];
        }
        return sum / gradeCount;
    }

    /**
     * Returns percentage assuming grades are out of 100.
     */
    public double getPercentage() {
        return getAverageGrade();
    }

    public int getAttendance() {
        return attendance;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Class: " + className
                + ", Average Grade: " + getAverageGrade()
                + ", Percentage: " + getPercentage() + "%"
                + ", Attendance: " + attendance + " days";
    }
}
