package com.thoughtworks.basic.domian;

public class ClassNum {
    private String ClassNumber;
    private Teacher teacher;

    public String getClassNumber() {
        return ClassNumber;
    }

    public void setClassNumber(String classNumber) {
        ClassNumber = classNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ClassNum(String classNumber, Teacher teacher) {
        ClassNumber = classNumber;
        this.teacher = teacher;
    }

    public ClassNum() {
    }
}
