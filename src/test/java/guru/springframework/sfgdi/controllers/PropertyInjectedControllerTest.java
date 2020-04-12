package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.controllers.services.GreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

  PropertyInjectedController controller;

  @BeforeEach
  void setup(){
    controller = new PropertyInjectedController();
    controller.greetingsService = new GreetingsServiceImpl();
  }

  @Test
  void sayGreeting() {
    String greeting = controller.sayGreeting();
    assertEquals("Hello Services",greeting);
  }
}
