package de.conciso.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    SpringApplication.run(HelloWorld.class);
  }
}
