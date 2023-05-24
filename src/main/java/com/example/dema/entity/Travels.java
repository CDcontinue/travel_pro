package com.example.dema.entity;


public class Travels {

  private long id;
  private String title;
  private String content;
  private java.sql.Timestamp pubDate;
  private String imgOne;
  private String imgTwo;
  private String imgThree;
  private String imgFour;
  private long userId;
  private long orderId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public java.sql.Timestamp getPubDate() {
    return pubDate;
  }

  public void setPubDate(java.sql.Timestamp pubDate) {
    this.pubDate = pubDate;
  }


  public String getImgOne() {
    return imgOne;
  }

  public void setImgOne(String imgOne) {
    this.imgOne = imgOne;
  }


  public String getImgTwo() {
    return imgTwo;
  }

  public void setImgTwo(String imgTwo) {
    this.imgTwo = imgTwo;
  }


  public String getImgThree() {
    return imgThree;
  }

  public void setImgThree(String imgThree) {
    this.imgThree = imgThree;
  }


  public String getImgFour() {
    return imgFour;
  }

  public void setImgFour(String imgFour) {
    this.imgFour = imgFour;
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
