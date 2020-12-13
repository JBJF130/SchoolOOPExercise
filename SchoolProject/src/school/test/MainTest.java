package school.test;

import school.School;
import school.student.Student;
import school.subject.Subject;


public class MainTest {


    public static void main(String[] args) {

        School school = new School();
        school.addRandomSubjects();
        printTotalStudentInSchool(school);
        printAvgGradesInSchool(school);
    }

    public static void printTotalStudentInSchool(School school) {

        int totalStudents = 0;
        for (Subject subject : school.getSubjects()) {
            System.out.println(subject.getSubjectName() + " ->" + subject.getStudents().length);
            totalStudents += subject.getStudents().length;

        }
        System.out.println("Total Students: " + totalStudents);
    }

    public static void printAvgGradesInSchool(School school) {

        double avgStudentGrade = 0;
        double avgSubject = 0;
        double schoolAvg = 0;
        for (Subject oneSubject : school.getSubjects()) {
            System.out.println(oneSubject.getSubjectName());
            System.out.println("=======================");
            for (Student oneStudent : oneSubject.getStudents()) {

                for (int oneGrade : oneStudent.getGrades()) {

                    avgStudentGrade += oneGrade;

                }
                avgStudentGrade /= oneStudent.getGrades().length;
                System.out.println("Avg of student " + oneStudent.getName() + " is " + avgStudentGrade);
                avgSubject += avgStudentGrade;
                avgStudentGrade = 0;
            }

            avgSubject /= oneSubject.getStudents().length;
            System.out.println("Avg in subject " + oneSubject.getSubjectName() + " is " + avgSubject);
            schoolAvg += avgSubject;
            avgSubject = 0;
        }
        System.out.println("=====================================");

        schoolAvg /= school.getSubjects().length;
        System.out.println("Total school Avg is " + (int) schoolAvg);
    }
}
