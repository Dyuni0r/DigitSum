package com.example.digitsum;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DigitSumController {
    int visitCounter = 0;
    @RequestMapping("/calc")
    public int calcDigitSum(@RequestParam int number) {
        //code inspired by: https://www.geeksforgeeks.org/java-program-for-sum-the-digits-of-a-given-number/

        int sum = 0;

        ArrayList<Integer> digits = new ArrayList<>();

        if (number < 0) {
            while (number != 0) {
                sum += -number % 10;
                digits.add(number % 10);
                number /= 10;
            }
            int firstDigit = digits.get(digits.size()-1);
            sum = sum + 2*firstDigit;
        }
        else {
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
        }
        visitCounter++;
        return sum;
    }

    @RequestMapping("/calc/counter")
    public int getVisitCounter(){
        return visitCounter;
    }
}
