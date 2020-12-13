package school.subject;

import school.student.Student;
import school.Trimester;

import java.util.Arrays;

public class Subject implements Trimester {
private static final int MIN_STUDENTS = 1;
private static final int MAX_STUDENTS = 30;
    private String subjectName;
    private Student[] students;


    public Subject() {
    }

    public Subject(String subjectName) {
        this.subjectName = subjectName;

    }



    public Student[] addRandomStudents(){

        int randomStudent = ((int)(Math.random()*(MAX_STUDENTS - MIN_STUDENTS) + MIN_STUDENTS));
        while (randomStudent == 0){
            randomStudent = ((int)(Math.random()*(MAX_STUDENTS - MIN_STUDENTS) + MIN_STUDENTS));
        }
        this.students = new Student[randomStudent];
        for (int i = 0 ; i < this.students.length; i ++){
            Student s = new Student();
            s.setGrades(getGradesByTrimester(1));
            this.students[i] = s;
        }
     return this.students;
    }


    public int [] getGradesByTrimester(int trimester){

        int totalExams = totalExamByTrimester(trimester);
        int [] gradesByTrimester = populateDefaultGrades(totalExams);

        for(Student oneStudent: this.students) {

            for (int i = 0; i < gradesByTrimester.length; i++) {
                int randomGrade = ((int) (Math.random() * 100));

                gradesByTrimester[i] = randomGrade;

            }


        }
        return gradesByTrimester;
    }

    private int[] populateDefaultGrades(int totalExams) {
        int [] gradesDefault = new int[totalExams];
        for (int i = 0 ; i < gradesDefault.length ; i++){
            gradesDefault[i] = 0;
        }
        return gradesDefault;
    }


    public String getSubjectName() {
        return subjectName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }

    @Override
    public int totalExamByTrimester(int trimester) {
        int totalExams = 0;
        switch (trimester){

            case 1:
                totalExams = 5;
                break;

            case 2:
                totalExams = 4;
                break;
            case 3:
                totalExams = 2;
                break;
        }
        return
                totalExams;

    }
}
