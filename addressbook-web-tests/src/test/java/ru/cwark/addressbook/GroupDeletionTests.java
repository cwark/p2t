package ru.cwark.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase{

  @Test
  public void testGroupDeletion() throws Exception {
    goToGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnGroupPage();
  }


}
