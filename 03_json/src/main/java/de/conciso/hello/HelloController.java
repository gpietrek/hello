package de.conciso.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  private final HelloService helloService;

  public HelloController(HelloService helloService) {
    this.helloService = helloService;
  }

  @GetMapping(path = "/api/hello")
  public HelloResponse hello(@RequestBody HelloRequest request) {
    var greetings = helloService.hello(request.getVorname(), request.getName());
    return new HelloResponse(greetings);
  }
}
