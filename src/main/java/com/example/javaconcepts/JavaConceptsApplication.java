package com.example.javaconcepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JavaConceptsApplication {

    public static void main(String[] args) {

       var context = SpringApplication.run(JavaConceptsApplication.class, args);

        //Ask Spring for the "Payment Controller bean" it created automatically
        var controller = context.getBean(PaymentController.class);

        // Use the controller ( beacuse it already has the MpesaPayment injected inside it!)
        controller.processpayment("paypal",245);
        controller.processpayment("mpesa",2456);

    }

}
