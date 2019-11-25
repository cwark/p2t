package ru.cwark.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper {
  public static final String USER = "user";
  public static final String PASS = "pass";
  private WebDriver wd;

  public SessionHelper(WebDriver wd) {
    this.wd = wd;
  }

  public void login(String username, String password) {
    wd.findElement(By.name(USER)).click();
    wd.findElement(By.name(USER)).clear();
    wd.findElement(By.name(USER)).sendKeys(username);
    wd.findElement(By.name(PASS)).click();
    wd.findElement(By.name(PASS)).clear();
    wd.findElement(By.name(PASS)).sendKeys(password);
    wd.findElement(By.xpath("//input[@value='Login']")).click();
  }
}
