package ru.cwark.addressbook.tests;

import org.testng.annotations.Test;
import ru.cwark.addressbook.model.ContactData;

public class ContactTests extends TestBase {

  @Test()
  public void testCreationContact() {
    app.getContactHelper().createContact(new ContactData("OneTest", "Testsovich", "Testov1", "0101991", "group3"));
  }

  @Test
  public void testDeletionContact() {
    if(!app.getContactHelper().isThereContact()){
      app.getContactHelper().createContact(new ContactData("OneTest", "Testsovich", "Testov1", "0101991", "group3"));
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteContact();
    app.getNavigationHelper().goToHomePage();
  }

  @Test
  public void testModificationContact() {
    if(!app.getContactHelper().isThereContact()){
      app.getContactHelper().createContact(new ContactData("OneTest", "Testsovich", "Testov1", "0101991", "group3"));
    }
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("TwoTest", "TestsovichTwo", "EditTestov", "9188367", "group3"), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnHomePage();
  }
}
