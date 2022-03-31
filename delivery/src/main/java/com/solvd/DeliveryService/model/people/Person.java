package com.solvd.DeliveryService.model.people;

public abstract class Person {
    private int age;
    private String sex;
    private int id;
    private String name;

    public Person(int age, String sex, int document, String name) {
        this.age = age;
        this.sex = sex;
        this.id = document;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getDocument() {
        return id;
    }

    public void setDocument(int document) {
        this.id = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "Age: " + age +
                        ", Sex: " + sex +
                        ", Document n°: " + id +
                        ", Name: " + name + "\n"
                ;
    }
}