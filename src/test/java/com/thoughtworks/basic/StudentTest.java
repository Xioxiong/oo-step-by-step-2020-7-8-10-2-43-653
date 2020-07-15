package com.thoughtworks.basic;

import com.thoughtworks.basic.domian.ClassNum;
import com.thoughtworks.basic.domian.Person;
import com.thoughtworks.basic.domian.Student;
import com.thoughtworks.basic.domian.Teacher;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public void testStudent(){
        //given
        ClassNum classNum = new ClassNum("2",new Teacher("teacher"));
        Student student1 = new Student("牛岩",23,classNum);
        Student student2 = new Student("黄鹏飞",23,classNum);
        Student student3 = new Student("杨京生",23,classNum);
        //when
        String introduce = student3.introduce();

        //Then
        assertEquals(introduce,"My name is 杨京生 I am 23 years old I am a Student of Class 2");
    }
}
