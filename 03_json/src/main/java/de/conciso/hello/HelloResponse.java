package de.conciso.hello;

public class HelloResponse {

  private final String greetings;

  public HelloResponse(String greetings) {
    this.greetings = greetings;
  }

  public String getGreetings() {
    return greetings;
  }
}
