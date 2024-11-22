package site.javadev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hello-endpoint")
    public String test() {
        return "hello-view";  // имя представления (например, hello-view.html)
    }

    @GetMapping("/")
    public String home() {
        return "home-view";  // имя представления (например, home-view.html)
    }
}
