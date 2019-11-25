package ru.cwark.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.goToGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("group2", "bla-bla", "by-by"));
    app.submitGroupCreation();
    app.returnGroupPage();
  }

}

