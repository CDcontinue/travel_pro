package com.example.dema.entity;


public class Collect {

  private long id;
  private java.sql.Timestamp time;
  private long userId;
  private long viewId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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


  public long getViewId() {
    return viewId;
  }

  public void setViewId(long viewId) {
    this.viewId = viewId;
  }

}
