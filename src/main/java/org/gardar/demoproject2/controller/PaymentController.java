package org.gardar.demoproject2.controller;

import org.gardar.demoproject2.exception.NotEnoughMoneyException;
import org.gardar.demoproject2.model.ErrorDetails;
import org.gardar.demoproject2.model.PaymentDetails;
import org.gardar.demoproject2.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> makePayment() {
        PaymentDetails paymentDetails = paymentService.processPayment();
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }
}
