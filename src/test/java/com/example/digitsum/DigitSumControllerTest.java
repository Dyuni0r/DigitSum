package com.example.digitsum;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class DigitSumControllerTest {
    DigitSumController digitSumController = new DigitSumController();

    @Test
    void DigitSumTest1(){
        int res = digitSumController.calcDigitSum(1234);
        assertEquals(res, 10);
    }

    @Test
    void DigitSumTest2(){
        int res = digitSumController.calcDigitSum(0);
        assertEquals(res, 0);
    }

    @Test
    void DigitSumTest3(){
        int res = digitSumController.calcDigitSum(-1);
        assertEquals(res, -1);
    }

    @Test
    void DigitSumTest4(){
        int res = digitSumController.calcDigitSum(46);
        assertEquals(res, 10);
    }
}
