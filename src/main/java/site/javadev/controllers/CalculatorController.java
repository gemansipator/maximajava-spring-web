package site.javadev.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/calculator")
    public String calculator(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value ="num2", required = false) Integer num2,
            Model model
    ) {
        if (num1 != null && num2 != null) {
            int sum = num1 + num2;
            model.addAttribute("sum", sum);
            int difference = num1 - num2;
            model.addAttribute("difference", difference);
            int product = num1 * num2;
            model.addAttribute("product", product);
            int divided  = num1 / num2;
            model.addAttribute("remainder", divided );

        }
        model.addAttribute("keyOfFirst", num1);
        model.addAttribute("keyOfSecond", num2);

        return "calculator-view";
    }
}
