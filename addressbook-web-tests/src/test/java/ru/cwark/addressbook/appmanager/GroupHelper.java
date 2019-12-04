package ru.cwark.addressbook.appmanager;

import com.sun.javafx.binding.ExpressionHelperBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.cwark.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {
  public static final String GROUP_NAME = "group_name";
  public static final String GROUP_HEADER = "group_header";
  public static final String GROUP_FOOTER = "group_footer";

  public GroupHelper(WebDriver wd) {
    super(wd);
  }


  public void returnGroupPage() {
    click(By.linkText("group page"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name(GROUP_NAME), groupData.getName());
    type(By.name(GROUP_HEADER), groupData.getHeader());
    type(By.name(GROUP_FOOTER), groupData.getFooter());
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void deleteSelectedGroups() {
    click(By.name("delete"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }

  public void initGroupModification() {
    click(By.name("edit"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }
}
