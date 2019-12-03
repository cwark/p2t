package ru.cwark.p2t.sunbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquTests {

  @Test
  public void testZeroRoot(){
    Equation e = new Equation(1,1,1);

    Assert.assertEquals(e.getRootNumber(), 0);
  }

  @Test
  public void testOneRoot(){
    Equation e = new Equation(1,2,1);

    Assert.assertEquals(e.getRootNumber(), 1);
  }

  @Test
  public void testTwoRoot(){
    Equation e = new Equation(1,5,3);

    Assert.assertEquals(e.getRootNumber(), 2);
  }
}
