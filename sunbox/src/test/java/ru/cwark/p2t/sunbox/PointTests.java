package ru.cwark.p2t.sunbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistance() {
    final double d = 2.8284271247461903;

    Point p1 = new Point(1,1);
    Point p2 = new Point(3,3);

    Assert.assertEquals(p1.distance(p2), d);
    Assert.assertEquals(p2.distance(p1), d);
    Assert.assertEquals(p1.distance(p2), p2.distance(p1));
  }
}
