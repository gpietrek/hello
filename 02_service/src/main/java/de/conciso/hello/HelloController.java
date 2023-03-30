package de.conciso.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  private final HelloService service;

  public HelloController(HelloService service) {
    this.service = service;
  }

  @GetMapping(path = "/api/hello")
  public String hello(@RequestParam String vorname, @RequestParam String name) {
    var greetings = service.sayHello(vorname, name);
    return greetings;
  }
}
