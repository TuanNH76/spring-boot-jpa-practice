package com.testprj.testjpa.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import javax.persistence.Id;

import java.io.Serializable;

@Entity
@Table(name = "employee")
@Data
public class Employee implements Serializable {
    private static final long serialVersionUID = -297553281792804396L;
    @Id
    private Integer id;

    @Column(name= "code")
    private String code;
    @Column(name="name")
    private  String name;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "age")
    private Integer age;

    public Employee(){

    }
    public Employee(Integer id, String code, String name, String email, String phone, Integer age) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
