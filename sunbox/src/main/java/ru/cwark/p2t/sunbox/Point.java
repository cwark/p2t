package ru.cwark.p2t.sunbox;

public class Point {
  public double x;
  public double y;

  public Point(double x, double y){
    this.x = x;
    this.y = y;
  }

  public double distance (Point p){
    double difX = p.x - this.x;
    double difY = p.y - this.y;
    double pow = 2;

    return Math.sqrt(Math.pow(difX, pow) + (Math.pow(difY, pow)));
  }


}
