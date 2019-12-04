package ru.cwark.addressbook.model;

public class ContactData {
  private final String fName;
  private final String mName;
  private final String lastName;
  private final String phHome;
  private final String group;

  public ContactData(String fName, String mName, String lName, String phHome, String group) {
    this.fName = fName;
    this.mName = mName;
    this.lastName = lName;
    this.phHome = phHome;
    this.group = group;
  }

  public String getfName() {
    return this.fName;
  }

  public String getmName() {
    return this.mName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getPhHome(){ return this.phHome; }

  public String getGroup(){ return this.group; }
}
