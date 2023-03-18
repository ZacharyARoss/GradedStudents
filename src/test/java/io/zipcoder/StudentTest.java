package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void testGetAverageExamScore() {
        double expected = 95.0;

        ArrayList<Double> testScores = new ArrayList<Double>();
        testScores.add(90.0);
        testScores.add(100.0);

        Student zach = new Student("Zach", "Ross",testScores);
//        zach.setTestScore(1, 95.0);
//        zach.setTestScore(2,100.0);

        double actual = zach.getAverageExamScore();



        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testSetTestScore() {
        Double expected = 100.0;
        int examNumber = 1;
        Double newScore = 100.0;

        ArrayList<Double> testScores = new ArrayList<Double>();

        testScores.add(95.0);
        testScores.add(102.0);
        Student student = new Student("Zach", "Ross", testScores);

        testScores.set(examNumber - 1, newScore);

        assertEquals(expected, newScore, 0.0);
    }
    @Test
    public void testAddTestScore() {

        ArrayList<Double> testScores = new ArrayList<Double>();
        testScores.add(0,90.0);
        testScores.add(1,88.0);

        int expected = 3;

        Student student = new Student("Zach", "Ross", testScores);

        testScores.add(88.0);

        int actual = testScores.size();


        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testGetNumberOfExamsTaken() {
        Integer expected = 2;
        ArrayList<Double> testScores = new ArrayList<Double>();
        testScores.add(0,90.0);
        testScores.add(1,88.0);

        Student student = new Student("Zach", "Ross", testScores);





        Integer actual = testScores.size();

        assertEquals(expected, actual);
    }
}
