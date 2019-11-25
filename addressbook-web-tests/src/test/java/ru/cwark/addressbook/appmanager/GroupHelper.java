package ru.cwark.addressbook.appmanager;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.cwark.addressbook.model.GroupData;

public class GroupHelper {
  public static final String GROUP_NAME = "group_name";
  public static final String GROUP_HEADER = "group_header";
  public static final String GROUP_FOOTER = "group_footer";
  private WebDriver wd;

  @Contract(pure = true)
  public GroupHelper(WebDriver wd) {
    this.wd = wd;
  }


  public void returnGroupPage() {
    wd.findElement(By.linkText("group page")).click();
  }

  public void submitGroupCreation() {
    wd.findElement(By.name("submit")).click();
  }

  public void fillGroupForm(@NotNull GroupData groupData) {
    wd.findElement(By.name(GROUP_NAME)).click();
    wd.findElement(By.name(GROUP_NAME)).clear();
    wd.findElement(By.name(GROUP_NAME)).sendKeys(groupData.getName());
    wd.findElement(By.name(GROUP_HEADER)).click();
    wd.findElement(By.name(GROUP_HEADER)).clear();
    wd.findElement(By.name(GROUP_HEADER)).sendKeys(groupData.getHeader());
    wd.findElement(By.name(GROUP_FOOTER)).click();
    wd.findElement(By.name(GROUP_FOOTER)).clear();
    wd.findElement(By.name(GROUP_FOOTER)).sendKeys(groupData.getFooter());
  }

  public void initGroupCreation() {
    wd.findElement(By.name("new")).click();
  }

  public void deleteSelectedGroups() {
    wd.findElement(By.name("delete")).click();
  }

  public void selectGroup() {
    wd.findElement(By.name("selected[]")).click();
  }
}
