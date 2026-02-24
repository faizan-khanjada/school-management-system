package model;

/**
 * Represents a teacher in the school.
 */
public class Teacher extends Person {
    private String subjectTaught;
    private double salary;

    public Teacher(int id, String name, int age, String subjectTaught, double salary) {
        super(id, name, age);
        this.subjectTaught = subjectTaught;
        this.salary = salary;
    }

    public void setSubjectTaught(String subjectTaught) {
        this.subjectTaught = subjectTaught;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Subject: " + subjectTaught
                + ", Salary: Rs " + salary;
    }
}
