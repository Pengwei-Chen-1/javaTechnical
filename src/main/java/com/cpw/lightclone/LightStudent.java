package com.cpw.lightclone;

/**
 * Created by epeicen on 11/12 0011.
 * LightStudent
 */
public class LightStudent implements Cloneable {
    private Subject subject;
    private String name;

    public LightStudent(String name, String subjectName) {
        this.name = name;
        this.subject = new Subject(subjectName);
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
