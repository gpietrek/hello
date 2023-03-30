package de.conciso.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping(path = "/api/hello")
  public String hello(@RequestParam String vorname, @RequestParam String name) {
    var greetings = sayHello(vorname, name);
    return greetings;
  }

  private String sayHello(String vorname, String name) {
    return "Hallo " + vorname + " " + name + "!";
  }
}
