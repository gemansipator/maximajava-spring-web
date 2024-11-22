package site.javadev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {


    @GetMapping("/")
    public String home() {
        return "home-view";  // имя представления (например, home-view.html)
    }
    @GetMapping("/hello-endpoint")
    public String test(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "age", required = false) Integer age,
            Model model){

        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "test-view";
    }

    @GetMapping("/nameAndCity")
    public String nameAndCity(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "city", required = false) String city,
            Model model) {

        model.addAttribute("name", name);
        model.addAttribute("city", city);

        return "name-and-city-view";
    }
    @GetMapping("/queston")
    public String queston(
            @RequestParam(value = "queston", required = false) String queston,
            @RequestParam(value = "id", required = false) Integer id,
            Model model) {

        model.addAttribute("Your Queston is" + queston);
        model.addAttribute("Your Id is"+ id);

        return "queston-view";
    }



}
