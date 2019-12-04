package ru.cwark.addressbook.tests;

import org.testng.annotations.Test;
import ru.cwark.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification(){
    app.getNavigationHelper().goToGroupPage();
    if (!app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("group4", null, null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "Tra-ta-ta", "RyRuRy"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnGroupPage();
  }
}
