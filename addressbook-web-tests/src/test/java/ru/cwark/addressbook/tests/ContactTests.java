package ru.cwark.addressbook.tests;

import org.testng.annotations.Test;
import ru.cwark.addressbook.model.ContactData;

public class ContactTests extends TestBase {

  @Test()
  public void testCreationContact() {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("OneTest", "Testsovich", "Testov1", "0101991", "group2"), true);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnHomePage();
  }

  @Test
  public void testDeletionContact() {
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteContact();
    app.getNavigationHelper().goToHomePage();

  }

  @Test
  public void testModificationContact() {
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("TwoTest", "TestsovichTwo", "EditTestov", "9188367", "group3"), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnHomePage();
  }
}