package com.thoughtworks.basic.domian;

public class Teacher extends Person {
    private String job;


    @Override
    public String introduce() {
        return super.introduce()+"I am a"+this.job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Teacher(String job) {
        this.job = job;
    }

    public Teacher() {
    }
}
