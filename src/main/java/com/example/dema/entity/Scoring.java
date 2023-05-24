package com.example.dema.entity;


public class Scoring {

  private long id;
  private double score;
  private java.sql.Timestamp time;
  private long userId;
  private long orderId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }


  public java.sql.Timestamp getTime() {
    return time;
  }

  public void setTime(java.sql.Timestamp time) {
    this.time = time;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }

}
