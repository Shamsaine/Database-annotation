package com.example.database;

import java.lang.annotation.Inherited;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class DatabaseModel {

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String firstname;

    @Column(nullable = false, length = 50)
    private String lastname;
    
    @Column(nullable = false)
    private int age;


    private float height;
    private float weight;
    
    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String  phone;

    private String address;
    
    public DatabaseModel(){}

    public DatabaseModel(Long id, String firstname, String lastname, int age, float height, float weight, String email, String password, phone, String address){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }

    // Getters and setters for each attribute
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getFirstname() {
        return firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String getLastname() {
        return lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public float getHeight() {
        return height;
    }
    
    public void setHeight(float height) {
        this.height = height;
    }
    
    public float getWeight() {
        return weight;
    }
    
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
 
}
