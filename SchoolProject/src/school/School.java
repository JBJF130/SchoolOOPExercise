package school;

import school.subject.Subject;

import java.util.Arrays;

public class School {


    private String name;
    private Subject[] subjects;
    private static int countSchool = 0;



    public School() {
        this.name = "School " + countSchool++;
    }


    public Subject[] addRandomSubjects(){

        int randomSubjects = ((int)(Math.random()*5)+1);
        this.subjects = new Subject[randomSubjects];
        for (int i = 0 ; i < randomSubjects ; i ++){

            Subject s = new Subject("Subject " + i);

            this.subjects[i] = s;
            this.subjects[i].addRandomStudents();

        }
        return this.subjects;
    }


    public String getName() {
        return name;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }
}
