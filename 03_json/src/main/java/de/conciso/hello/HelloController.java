package de.conciso.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  private final HelloService service;

  public HelloController(HelloService service) {
    this.service = service;
  }

  @GetMapping(path = "/api/hello")
  public HelloResponse hello(@RequestBody HelloRequest request) {
    var greetings = service.sayHello(request.getVorname(), request.getName());
    return new HelloResponse(greetings);
  }
}
