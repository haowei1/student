package com.hdy.student.model;

/**
 * @author m760384371
 * @date 2019/8/13
 */
public class Student {
    private int id;
    private String name;
    private String password;
    private int age;
    private String phone;
    private String email;
    private String city;

    public Student() {
    }

    public Student(String name, String password, int age, String phone, String email, String city) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.city = city;
    }

    public Student(int id, String name, String password, int age, String phone, String email, String city) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
