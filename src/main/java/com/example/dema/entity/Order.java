package com.example.dema.entity;


public class Order {

  private long id;
  private long ticketsNum;
  private double actualPay;
  private java.sql.Timestamp comeDate;
  private java.sql.Timestamp pubDate;
  private long userId;
  private long viewId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getTicketsNum() {
    return ticketsNum;
  }

  public void setTicketsNum(long ticketsNum) {
    this.ticketsNum = ticketsNum;
  }


  public double getActualPay() {
    return actualPay;
  }

  public void setActualPay(double actualPay) {
    this.actualPay = actualPay;
  }


  public java.sql.Timestamp getComeDate() {
    return comeDate;
  }

  public void setComeDate(java.sql.Timestamp comeDate) {
    this.comeDate = comeDate;
  }


  public java.sql.Timestamp getPubDate() {
    return pubDate;
  }

  public void setPubDate(java.sql.Timestamp pubDate) {
    this.pubDate = pubDate;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getViewId() {
    return viewId;
  }

  public void setViewId(long viewId) {
    this.viewId = viewId;
  }

}
