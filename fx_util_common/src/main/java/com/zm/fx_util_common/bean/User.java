package com.zm.fx_util_common.bean;

import java.io.Serializable;

public class User  implements Serializable {
    private Long id;

    private String username;

    private String realname;

    private String password;

    private String phone;

    private Integer phoneispass;

    private String email;

    private Integer emailispass;

    private String address;

    private String lastlogintime;

    private String updated;

    private String created;

    public User(Long id, String username, String realname, String password, String phone, Integer phoneispass, String email, Integer emailispass, String address, String lastlogintime, String updated, String created) {
        this.id = id;
        this.username = username;
        this.realname = realname;
        this.password = password;
        this.phone = phone;
        this.phoneispass = phoneispass;
        this.email = email;
        this.emailispass = emailispass;
        this.address = address;
        this.lastlogintime = lastlogintime;
        this.updated = updated;
        this.created = created;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getPhoneispass() {
        return phoneispass;
    }

    public void setPhoneispass(Integer phoneispass) {
        this.phoneispass = phoneispass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getEmailispass() {
        return emailispass;
    }

    public void setEmailispass(Integer emailispass) {
        this.emailispass = emailispass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(String lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}