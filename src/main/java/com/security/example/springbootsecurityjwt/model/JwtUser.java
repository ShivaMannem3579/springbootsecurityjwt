package com.security.example.springbootsecurityjwt.model;

public class JwtUser {
    private String userName;
    private String role;
    private long id;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public String getUserName() {
        return userName;
    }

    public long getId() {
        return id;
    }
}
