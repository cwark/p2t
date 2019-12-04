package ru.cwark.addressbook.tests;

import org.testng.annotations.Test;
import ru.cwark.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().createGroup(new GroupData("group3", null, null));
  }

}

