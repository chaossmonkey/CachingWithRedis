package com.example.rediscache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class FactorialService {

    @Cacheable(value = "factorialCache", key = "#number")
    public long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        try {
            // Simulating an expensive operation with Thread.sleep()
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return number * calculateFactorial(number - 1);
    }
}
