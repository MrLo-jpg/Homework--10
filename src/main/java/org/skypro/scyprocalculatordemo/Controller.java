package org.skypro.scyprocalculatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")


public class Controller {
    private final Servis servis;

    public Controller(Servis servis) {
        this.servis = servis;
    }

    @GetMapping(path = "")
    public String calculator() {
        return servis.Calculator();

    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return servis.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return servis.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return servis.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return servis.divide(num1, num2);
    }


}
