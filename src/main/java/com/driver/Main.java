package com.driver;

public class Main {
  public static void main(String[] args){
  RWOnly obj = new RWOnly();
  obj.setName("Nikul");
  String name = obj.getName();
  System.out.println(name);
  }
}
