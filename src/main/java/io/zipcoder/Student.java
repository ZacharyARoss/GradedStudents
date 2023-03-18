package io.zipcoder;

import java.util.ArrayList;

public class Student {
    private String firstName;
   private String lastName;
   private ArrayList<Double> testScores;

   public Student(String firstName, String lastName, ArrayList<Double> testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = testScores;

   }

   public double getAverageExamScore(){
        double sum = 0.0;
        for (double value : testScores){
            sum += value;
        }
        return sum/testScores.size();
   }
   public void setTestScore(int examNumber, double newScore){
       testScores.set(examNumber - 1, newScore);
   }

   public void addTestScore(double recentTestScore){
        testScores.add(recentTestScore);
   }
   public String getTestScores(){
       return testScores.toString();

   }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumberOfExamsTaken(){
       return testScores.size();
    }
}
