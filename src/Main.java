import java.util.*;

import service.School;
import model.Student;
import model.Teacher;
import model.Subject;

/**
 * Entry point of the application.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();
        int choice;

        do {
            System.out.println("\nSchool Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Add Subject");
            System.out.println("4. Mark Student Attendance");
            System.out.println("5. Add Grade to Student");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Update Teacher");
            System.out.println("9. Delete Teacher");
            System.out.println("10. Update Subject");
            System.out.println("11. Delete Subject");
            System.out.println("12. Display Students");
            System.out.println("13. Display Teachers");
            System.out.println("14. Display Subjects");
            System.out.println("15. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();
                    System.out.print("Enter Student Name: ");
                    String studentName = scanner.next();
                    System.out.print("Enter Student Age: ");
                    int studentAge = scanner.nextInt();
                    System.out.print("Enter Student Class: ");
                    String className = scanner.next();
                    school.addStudent(new Student(studentId, studentName, studentAge, className));
                    break;

                case 2:
                    System.out.print("Enter Teacher ID: ");
                    int teacherId = scanner.nextInt();
                    System.out.print("Enter Teacher Name: ");
                    String teacherName = scanner.next();
                    System.out.print("Enter Teacher Age: ");
                    int teacherAge = scanner.nextInt();
                    System.out.print("Enter Subject Taught: ");
                    String subjectTaught = scanner.next();
                    System.out.print("Enter Teacher Salary: ");
                    double salary = scanner.nextDouble();
                    school.addTeacher(new Teacher(teacherId, teacherName, teacherAge, subjectTaught, salary));
                    break;

                case 3:
                    System.out.print("Enter Subject ID: ");
                    int subjectId = scanner.nextInt();
                    System.out.print("Enter Subject Name: ");
                    String subjectName = scanner.next();
                    school.addSubject(new Subject(subjectId, subjectName));
                    break;

                case 4:
                    System.out.print("Enter Student ID to mark attendance: ");
                    school.markStudentAttendance(scanner.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Student ID to add grade: ");
                    int gradeStudentId = scanner.nextInt();
                    System.out.print("Enter Grade: ");
                    double grade = scanner.nextDouble();
                    school.addGradeToStudent(gradeStudentId, grade);
                    break;

                case 6:
                    System.out.print("Enter Student ID to update: ");
                    int updateStudentId = scanner.nextInt();
                    System.out.print("Enter new Student Name: ");
                    String newStudentName = scanner.next();
                    System.out.print("Enter new Student Age: ");
                    int newStudentAge = scanner.nextInt();
                    System.out.print("Enter new Student Class: ");
                    String newClassName = scanner.next();
                    school.updateStudent(updateStudentId, newStudentName, newStudentAge, newClassName);
                    break;

                case 7:
                    System.out.print("Enter Student ID to delete: ");
                    school.deleteStudent(scanner.nextInt());
                    break;

                case 8:
                    System.out.print("Enter Teacher ID to update: ");
                    int updateTeacherId = scanner.nextInt();
                    System.out.print("Enter new Teacher Name: ");
                    String newTeacherName = scanner.next();
                    System.out.print("Enter new Teacher Age: ");
                    int newTeacherAge = scanner.nextInt();
                    System.out.print("Enter new Subject Taught: ");
                    String newSubjectTaught = scanner.next();
                    System.out.print("Enter new Teacher Salary: ");
                    double newSalary = scanner.nextDouble();
                    school.updateTeacher(updateTeacherId, newTeacherName, newTeacherAge, newSubjectTaught, newSalary);
                    break;

                case 9:
                    System.out.print("Enter Teacher ID to delete: ");
                    school.deleteTeacher(scanner.nextInt());
                    break;

                case 10:
                    System.out.print("Enter Subject ID to update: ");
                    int updateSubjectId = scanner.nextInt();
                    System.out.print("Enter new Subject Name: ");
                    String newSubjectName = scanner.next();
                    school.updateSubject(updateSubjectId, newSubjectName);
                    break;

                case 11:
                    System.out.print("Enter Subject ID to delete: ");
                    school.deleteSubject(scanner.nextInt());
                    break;

                case 12:
                    school.displayStudents();
                    break;

                case 13:
                    school.displayTeachers();
                    break;

                case 14:
                    school.displaySubjects();
                    break;

                case 15:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 15);
    }
}
