package de.conciso.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

  public String hello(String vorname, String name) {
    return "Hallo " + vorname + " " + name + "!";
  }
}
