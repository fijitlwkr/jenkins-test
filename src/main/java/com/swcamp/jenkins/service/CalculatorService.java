package com.swcamp.jenkins.service;

import com.swcamp.jenkins.dto.CalculatorDto;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int plusTwoNumbers(CalculatorDto calDto) {
        return calDto.getNum1() + calDto.getNum2();
    }
}
