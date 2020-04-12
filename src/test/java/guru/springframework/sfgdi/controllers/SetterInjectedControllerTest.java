package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.controllers.services.GreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

  SetterInjectedController setterInjectedController;

  @BeforeEach
  void setUp() {
    setterInjectedController = new SetterInjectedController();
    setterInjectedController.setGreetingsService(new GreetingsServiceImpl());
  }

  @Test
  void sayGreetings() {
    String greetings = setterInjectedController.sayGreetings();
    assertEquals("Hello Services", greetings);
  }
}
