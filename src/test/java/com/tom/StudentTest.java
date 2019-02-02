package com.tom;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StudentTest {
    @Test
    public void highest(){
        Student student = new Student("Hank",60,80);
        Assertions.assertEquals(80,student.highest());
    }
    @Test
    public void getAverage(){
        Student student = new Student("Hank",66,87);
        Assertions.assertEquals((66+87)/2,student.getAverage());
    }
}
