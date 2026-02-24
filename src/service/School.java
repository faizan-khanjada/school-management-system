package service;

import model.Student;
import model.Teacher;
import model.Subject;


/**
 * Core management class handling students, teachers, and subjects.
 */
public class School {
    private Student[] students;
    private Teacher[] teachers;
    private Subject[] subjects;
    private int studentCount, teacherCount, subjectCount;

    public School() {
        students = new Student[100];
        teachers = new Teacher[50];
        subjects = new Subject[20];
        studentCount = 0;
        teacherCount = 0;
        subjectCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Cannot add more students. Limit reached.");
        }
    }

    public void addTeacher(Teacher teacher) {
        if (teacherCount < teachers.length) {
            teachers[teacherCount++] = teacher;
            System.out.println("Teacher added successfully!");
        } else {
            System.out.println("Cannot add more teachers. Limit reached.");
        }
    }

    public void addSubject(Subject subject) {
        if (subjectCount < subjects.length) {
            subjects[subjectCount++] = subject;
            System.out.println("Subject added successfully!");
        } else {
            System.out.println("Cannot add more subjects. Limit reached.");
        }
    }

    public void markStudentAttendance(int studentId) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == studentId) {
                students[i].markAttendance();
                System.out.println("Attendance marked for " + students[i].getName());
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void addGradeToStudent(int studentId, double grade) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == studentId) {
                students[i].addGrade(grade);
                System.out.println("Grade added for " + students[i].getName());
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void updateStudent(int studentId, String name, int age, String className) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == studentId) {
                students[i].setName(name);
                students[i].setAge(age);
                students[i].setClassName(className);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void deleteStudent(int studentId) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == studentId) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                studentCount--;
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void updateTeacher(int teacherId, String name, int age, String subjectTaught, double salary) {
        for (int i = 0; i < teacherCount; i++) {
            if (teachers[i].getId() == teacherId) {
                teachers[i].setName(name);
                teachers[i].setAge(age);
                teachers[i].setSubjectTaught(subjectTaught);
                teachers[i].setSalary(salary);
                System.out.println("Teacher updated successfully!");
                return;
            }
        }
        System.out.println("Teacher not found!");
    }

    public void deleteTeacher(int teacherId) {
        for (int i = 0; i < teacherCount; i++) {
            if (teachers[i].getId() == teacherId) {
                for (int j = i; j < teacherCount - 1; j++) {
                    teachers[j] = teachers[j + 1];
                }
                teacherCount--;
                System.out.println("Teacher deleted successfully!");
                return;
            }
        }
        System.out.println("Teacher not found!");
    }

    public void updateSubject(int subjectId, String subjectName) {
        for (int i = 0; i < subjectCount; i++) {
            if (subjects[i].getSubjectId() == subjectId) {
                subjects[i].setSubjectName(subjectName);
                System.out.println("Subject updated successfully!");
                return;
            }
        }
        System.out.println("Subject not found!");
    }

    public void deleteSubject(int subjectId) {
        for (int i = 0; i < subjectCount; i++) {
            if (subjects[i].getSubjectId() == subjectId) {
                for (int j = i; j < subjectCount - 1; j++) {
                    subjects[j] = subjects[j + 1];
                }
                subjectCount--;
                System.out.println("Subject deleted successfully!");
                return;
            }
        }
        System.out.println("Subject not found!");
    }

    public void displayStudents() {
        if (studentCount == 0) {
            System.out.println("No students found!");
        } else {
            for (int i = 0; i < studentCount; i++) {
                System.out.println(students[i]);
            }
        }
    }

    public void displayTeachers() {
        if (teacherCount == 0) {
            System.out.println("No teachers found!");
        } else {
            for (int i = 0; i < teacherCount; i++) {
                System.out.println(teachers[i]);
            }
        }
    }

    public void displaySubjects() {
        if (subjectCount == 0) {
            System.out.println("No subjects found!");
        } else {
            for (int i = 0; i < subjectCount; i++) {
                System.out.println(subjects[i]);
            }
        }
    }

    public void displayStudentPercentage(int studentId) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == studentId) {
                System.out.println("Percentage of " + students[i].getName() + ": "
                        + students[i].getPercentage() + "%");
                return;
            }
        }
        System.out.println("Student not found!");
    }
}
