package com.thoughtworks.basic.domian;

public class Student extends Person{
    private ClassNum classNumber;

    @Override
    public String introduce() {
        return super.introduce()+" I am a Student of Class "+classNumber.getClassNumber();
    }

    public ClassNum getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(ClassNum classNumber) {
        this.classNumber = classNumber;
    }

    public Student(String name, int age, ClassNum classNumber) {
        super(name, age);
        this.classNumber = classNumber;
    }
}
