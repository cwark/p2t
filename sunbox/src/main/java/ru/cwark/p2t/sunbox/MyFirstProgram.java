package ru.cwark.p2t.sunbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("Lesha");
    hello("user");
    hello();

    double len = 5;
    System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));

    double a = 4;
    double b = 6;
    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
  }

  public static void hello() {
    System.out.println("Hello, world!");
  }

  public static void hello(String name) {
    System.out.println("Hello, " + name + "!");
  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a * b;
  }

}