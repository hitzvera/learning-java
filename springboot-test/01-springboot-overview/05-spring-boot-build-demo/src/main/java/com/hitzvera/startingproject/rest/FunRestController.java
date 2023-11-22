package com.hitzvera.startingproject.rest;


import com.hitzvera.startingproject.data.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class FunRestController {
      // export "/" that return hello world
      private static final String template = "Hello, %s!";
      private static final AtomicLong counter = new AtomicLong();

      @GetMapping("/")
      public String hello() {
            return "Hello World";
      }

      // expose a new workout endpoint
      @GetMapping("/workout")
      public String workout() {
            return "Workout";
      }

      @GetMapping("/fortune")
      public String fortune() {
            return "Fortune";
      }

      @GetMapping("/greeting")
      public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
            return new Greeting(counter.incrementAndGet(), String.format(template, name));
      }


}
