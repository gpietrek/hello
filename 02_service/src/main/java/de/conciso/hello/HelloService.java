package de.conciso.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
  public String sayHello(String vorname, String name) {
    return "Hallo " + vorname + " " + name + "!";
  }
}
