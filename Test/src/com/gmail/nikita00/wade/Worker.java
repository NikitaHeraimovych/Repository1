package com.gmail.nikita00.wade;

public class Worker{
    private String name;
    private int age;
    private int rank;

    public Worker(String name, int age, int rank){
        this.name = name;
        this.age = age;
        this.rank = rank;

    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public int getRank(){
        return rank;
    }

    public void setRank(int rank){
        this.rank = rank;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Worker w = (Worker)o;
        return name.equals (w.name) &&
                age == w.age &&
                rank == w.rank;
    }

    @Override
    public int hashCode(){
        return 23 * age + name.hashCode() * 23 + rank;
    }


}
