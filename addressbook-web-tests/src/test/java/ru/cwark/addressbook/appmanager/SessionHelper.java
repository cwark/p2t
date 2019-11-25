package ru.cwark.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {
  public static final String USER = "user";
  public static final String PASS = "pass";


  public SessionHelper(WebDriver wd) {
    super(wd);
  }

  public void login(String username, String password) {
    type(By.name(USER), username);
    type(By.name(PASS), password);
    click(By.xpath("//input[@value='Login']"));
  }
}
