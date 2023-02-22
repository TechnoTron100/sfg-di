package mega.trontech.sfgdi.controllers;

import mega.trontech.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHell() {


        return greetingService.sayGreeting();
    }
}
