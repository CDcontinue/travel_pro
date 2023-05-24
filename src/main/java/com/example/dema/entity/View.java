package com.example.dema.entity;


public class View {

  private long id;
  private String name;
  private String address;
  private String introduce;
  private double score;
  private String suggestTime;
  private double tickets;
  private String imgOne;
  private String imgTwo;
  private String imgThree;
  private String imgFour;
  private long cityId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getIntroduce() {
    return introduce;
  }

  public void setIntroduce(String introduce) {
    this.introduce = introduce;
  }

  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }

  public String getSuggestTime() {
    return suggestTime;
  }

  public void setSuggestTime(String suggestTime) {
    this.suggestTime = suggestTime;
  }

  public double getTickets() {
    return tickets;
  }

  public void setTickets(double tickets) {
    this.tickets = tickets;
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

  public long getCityId() {
    return cityId;
  }

  public void setCityId(long cityId) {
    this.cityId = cityId;
  }
}
