package ru.cwark.addressbook.model;

public class ContactData {
  private final String fName;
  private final String mName;
  private final String lastName;
  private final String phHome;

  public ContactData(String fName, String mName, String lName, String phHome) {
    this.fName = fName;
    this.mName = mName;
    this.lastName = lName;
    this.phHome = phHome;
  }

  public String getfName() {
    return fName;
  }

  public String getmName() {
    return mName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getPhHome(){ return phHome; }
}
