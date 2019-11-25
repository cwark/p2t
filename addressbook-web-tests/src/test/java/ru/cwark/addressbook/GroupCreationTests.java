package ru.cwark.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    goToGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("group2", "bla-bla", "by-by"));
    submitGroupCreation();
    returnGroupPage();
  }

}

