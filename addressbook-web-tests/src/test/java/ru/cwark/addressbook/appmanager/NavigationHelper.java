package ru.cwark.addressbook.appmanager;

import org.jetbrains.annotations.Contract;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {


  @Contract(pure = true)
  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void goToGroupPage() {
    click(By.linkText("groups"));
  }

  public void goToHomePage() {
    click(By.linkText("home"));
  }
}
