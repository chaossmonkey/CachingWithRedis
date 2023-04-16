package com.example.rediscache;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    private FactorialService factorialService;

    public FactorialController(FactorialService factorialService) {
        this.factorialService = factorialService;
    }

    @GetMapping("/factorial")
    public long factorial()
    {
        System.out.println(factorialService.calculateFactorial(4));
        return factorialService.calculateFactorial(4);
    }
    @GetMapping("/factorial/{number}")
    public long getFactorial(@PathVariable int number) {
        System.out.println(factorialService.calculateFactorial(number));
        return factorialService.calculateFactorial(number);
    }
}
