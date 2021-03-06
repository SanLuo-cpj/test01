package com.bjpowernode.domain;

public class Person {
    private String id;
    private String name;
    private String email;

    private String sex;

    private String phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Person(String id, String name, String email, String sex, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.sex = sex;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
