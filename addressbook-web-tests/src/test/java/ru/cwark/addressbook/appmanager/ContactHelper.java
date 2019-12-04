package ru.cwark.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.cwark.addressbook.model.ContactData;

import java.util.concurrent.TimeUnit;

public class ContactHelper extends HelperBase {
  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getfName());
    type(By.name("middlename"), contactData.getmName());
    type(By.name("lastname"), contactData.getLastName());
    type(By.name("home"), contactData.getPhHome());
    if (creation){
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    }else{
      wd.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
      Assert.assertFalse(isElementPresent(By.name("new_group")));
      wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
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

  public void createContact(ContactData contact){
    System.out.println("Создаем контакт");
    initContactCreation();
    fillContactForm(contact, true);
    submitContactCreation();
    returnHomePage();
  }

  public boolean isThereContact() {
    boolean r;
    wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    r = isElementPresent(By.name("selected[]"));
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    return r;
  }
}
