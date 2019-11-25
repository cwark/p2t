package ru.cwark.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.cwark.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getfName());
    type(By.name("middlename"), contactData.getmName());
    type(By.name("lastname"), contactData.getLastName());
    type(By.name("home"), contactData.getPhHome());
  }

  public void submitContactCreation() {
    click(By.name("submit"));
  }

  public void returnHomePage() {
    click(By.linkText("home page"));
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void deleteContact() {
    click(By.xpath("//input[@value='Delete']"));
    if (isAlertPresent()) {
      wd.switchTo().alert().accept();
    }

  }

  public void initContactModification() {
    click(By.xpath("//img[@title='Edit']"));
  }

  public void submitContactModification() {
    click(By.name("update"));
  }
}
