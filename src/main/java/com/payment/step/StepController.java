package com.payment.step;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/step")
public class StepController {
	
	@GetMapping("/status")
    public ResponseEntity<String> get(@RequestParam String gtsMessageId, @RequestParam String idExecution) {
		
		log.info("Gateway request: gtsMessageId {} - idExecution {}", gtsMessageId, idExecution);
		
		return ResponseEntity.ok("Step1 working");
		
	}

}
