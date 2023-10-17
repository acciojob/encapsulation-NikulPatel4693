package com.driver;

public class Main {
  RWOnly obj = new RWOnly();
  obj.setName("Nikul");
  String name = obj.getName();
  System.out.println(name);
}
