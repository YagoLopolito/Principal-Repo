package com.solvd.DeliveryService.model.generic;

public class GenericClientDetails<A, B, C, D> {
    private A age;
    private B sex;
    private C document;
    private D name;

    public A getAge() {
        return age;
    }

    public void setAge(A age) {
        this.age = age;
    }

    public B getSex() {
        return sex;
    }

    public void setSex(B sex) {
        this.sex = sex;
    }

    public C getDocument() {
        return document;
    }

    public void setDocument(C document) {
        this.document = document;
    }

    public D getName() {
        return name;
    }

    public void setName(D name) {
        this.name = name;
    }
}
