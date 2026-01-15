package com.swcamp.jenkins.controller;

import com.swcamp.jenkins.dto.CalculatorDto;
import com.swcamp.jenkins.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CalculatorController {

    private final CalculatorService calService;

    @GetMapping("/health")
    public String healthCheck() {
        return "Hello, I'm alive";
    }

    @GetMapping("/plus")
    public ResponseEntity<CalculatorDto> plusTwoNumbers(CalculatorDto calDto) {
        log.info("[0]핸들러 메소드 실행 여부 및 값 확인 : {}", calDto);
        int result = calService.plusTwoNumbers(calDto);
        log.info("[1]서비스 계층 결과값 리턴 확인 {}", result);
        calDto.setSum(result);
        return ResponseEntity.ok(calDto);
    }
}
