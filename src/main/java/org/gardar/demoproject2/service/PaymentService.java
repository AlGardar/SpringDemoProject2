package org.gardar.demoproject2.service;

import org.gardar.demoproject2.exception.NotEnoughMoneyException;
import org.gardar.demoproject2.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException("Not Enough Money");
    }
}
