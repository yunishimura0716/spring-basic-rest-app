package com.yuri.rest.services.restfulwebservices.user;

import java.util.Date;

public class User {
    private Integer id;
    private String name;
    private Date birthDate;

    protected User() {

    }

    public User(Integer id, String name, Date birthdDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthdDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
