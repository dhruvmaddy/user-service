package com.dhruv.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private long userId;
    private String name;
    private String phone;

    List<Contact> contactList = new ArrayList<>();

    public User(long userId, String name, String phone, List<Contact> contactList) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.contactList = contactList;
    }

    public User(long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    public User() {
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
}
