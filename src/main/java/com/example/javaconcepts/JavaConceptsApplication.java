package com.example.javaconcepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaConceptsApplication {

    public static void main(String[] args) {

        SpringApplication.run(JavaConceptsApplication.class, args);

        //create an mpesa payment object to make mpesa payment
        MpesaPayment mpesaPayment = new MpesaPayment();
        mpesaPayment.payment(25.00);

        //create a PAypalPayment object to make a paypall payment
        PaypalPayment paypalPayment = new PaypalPayment();
        paypalPayment.payment(79.00);
    }

}
