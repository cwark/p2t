package ru.cwark.p2t.sunbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    getDistance();
  }

  public static void getDistance() {
    Point p1 = new Point(1, 2);
    Point p2 = new Point(3, 4);
    System.out.println("D1: " + distance(p1, p2));
    System.out.println("D2: " + p1.distance(p2));
    System.out.println("D3: " + p2.distance(p1));
  }

  public static double distance(Point p1, Point p2) {
    double difX = p2.x - p1.x;
    double difY = p2.y - p1.y;
    double pow = 2;

    return Math.sqrt(Math.pow(difX, pow) + (Math.pow(difY, pow)));
  }



  public static void exp() {
    hello("Lesha");
    hello("user");
    hello();

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.len + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
  }

  public static void hello() {
    System.out.println("Hello, world!");
  }

  public static void hello(String name) {
    System.out.println("Hello, " + name + "!");
  }


}