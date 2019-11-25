package ru.cwark.addressbook;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

  public static final String USER = "user";
  public static final String PASS = "pass";
  public static final String GROUP_NAME = "group_name";
  public static final String GROUP_HEADER = "group_header";
  public static final String GROUP_FOOTER = "group_footer";
  protected WebDriver wd;

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    //wd = new FirefoxDriver();
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    wd.get("http://localhost/addressbook/");

    login("admin", "secret");
  }

  private void login(String username, String password) {
    wd.findElement(By.name(USER)).click();
    wd.findElement(By.name(USER)).clear();
    wd.findElement(By.name(USER)).sendKeys(username);
    wd.findElement(By.name(PASS)).click();
    wd.findElement(By.name(PASS)).clear();
    wd.findElement(By.name(PASS)).sendKeys(password);
    wd.findElement(By.xpath("//input[@value='Login']")).click();
  }

  protected void returnGroupPage() {
    wd.findElement(By.linkText("group page")).click();
  }

  protected void submitGroupCreation() {
    wd.findElement(By.name("submit")).click();
  }

  protected void fillGroupForm(@NotNull GroupData groupData) {
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

  protected void initGroupCreation() {
    wd.findElement(By.name("new")).click();
  }

  protected void goToGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.findElement(By.linkText("Logout")).click();
    wd.quit();
  }

  protected void deleteSelectedGroups() {
    wd.findElement(By.name("delete")).click();
  }

  protected void selectGroup() {
    wd.findElement(By.name("selected[]")).click();
  }
}
