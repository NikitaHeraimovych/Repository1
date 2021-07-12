package com.gmail.nikita00.wade;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String group;

    public Student (String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getGroup () {
        return group;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass ( ) != o.getClass ( )) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals (name, student.name) &&
                Objects.equals (group, student.group);
    }

    @Override
    public int hashCode () {
        return Objects.hash (name, age, group);
    }

    public void setGroup (String group) {
        this.group = group;
    }
}
