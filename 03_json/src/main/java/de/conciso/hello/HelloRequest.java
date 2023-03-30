package de.conciso.hello;

public class HelloRequest {

  private final String vorname;

  private final String name;

  public HelloRequest(String vorname, String name) {
    this.vorname = vorname;
    this.name = name;
  }

  public String getVorname() {
    return vorname;
  }

  public String getName() {
    return name;
  }
}
