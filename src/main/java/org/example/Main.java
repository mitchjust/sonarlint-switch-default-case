package org.example;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  public void something(MyEnum e) {
    String label = switch (e) {
      case A -> "A";
      case B -> "B";
      case C -> "C";
    };

    System.out.println("label = " + label);
  }
}