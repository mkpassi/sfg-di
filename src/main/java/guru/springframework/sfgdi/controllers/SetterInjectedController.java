package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.controllers.services.GreetingsService;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

  private GreetingsService greetingsService;

  public void setGreetingsService(GreetingsService greetingsService) {
    this.greetingsService = greetingsService;
  }

  public String sayGreetings() {
    String greeting = greetingsService.sayGreetings();
    System.out.println("#########################################################");
    System.out.println(greeting);
    System.out.println("#########################################################");
    return greeting;
  }
}
