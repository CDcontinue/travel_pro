package com.example.dema.entity;


import java.sql.Timestamp;
import java.util.List;

public class UserInfo {

  private long id;
  private String account;
  private String password;
  private String nickname;
  private String photo;
  private String sex;
  private String phone;
  private double balance;
  private String iDnumber;
  private java.sql.Timestamp regDate;

  private List<Role> roles;//用户所有权限

  public List<Role> getRoles() {
    return roles;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
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

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getiDnumber() {
    return iDnumber;
  }

  public void setiDnumber(String iDnumber) {
    this.iDnumber = iDnumber;
  }

  public Timestamp getRegDate() {
    return regDate;
  }

  public void setRegDate(Timestamp regDate) {
    this.regDate = regDate;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

  @Override
  public String toString() {
    return "UserI{" +
            "id=" + id +
            ", account='" + account + '\'' +
            ", password='" + password + '\'' +
            ", nickname='" + nickname + '\'' +
            ", photo='" + photo + '\'' +
            ", sex='" + sex + '\'' +
            ", phone='" + phone + '\'' +
            ", balance=" + balance +
            ", iDnumber='" + iDnumber + '\'' +
            ", regDate=" + regDate +
            ", roles=" + roles +
            '}';
  }
}
