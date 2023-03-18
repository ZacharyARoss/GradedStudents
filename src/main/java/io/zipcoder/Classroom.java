package io.zipcoder;

import java.util.ArrayList;

public class Classroom {
    private Student[] students;
    private int maxNumberOfStudents;

    public Classroom(int maxNumberOfStudents, Student[] Students){
        this.maxNumberOfStudents = maxNumberOfStudents;
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom (){
        this.maxNumberOfStudents = 30;
        this.students = new Student[maxNumberOfStudents];
    }

    public Student[] getStudents(){
        return students;
    }

    public Double getAverageExamScores(){
    return 0.0;
    }
}

