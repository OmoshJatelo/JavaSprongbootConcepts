package com.example.javaconcepts;
// this class implements the payme t servie interface and uses the signature specified in the payment service interface

import org.springframework.stereotype.Service;

@Service("paypal")
public class PaypalPayment implements PaymentServiceInterface {
    @Override
    public void payment(double amount) {
        System.out.println("Paying a total of "+amount +" Via paypal");
    }
}
