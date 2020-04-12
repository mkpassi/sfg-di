package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.controllers.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingsService greetingsService;

    public String sayGreeting(){
        String greetings = greetingsService.sayGreetings();
        return greetings;
    }

}
