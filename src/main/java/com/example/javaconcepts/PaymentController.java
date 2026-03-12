package com.example.javaconcepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller
public class PaymentController {
    //spring automatically fills this map with all the 'PaymentSrrviceInterface ' beans
    private final Map<String, PaymentServiceInterface> paymentMethods;

    // constuctor
    @Autowired //for dependency injection.  tell spring to Find an object that fits this type and plug it in here automatically."
    public PaymentController(Map<String, PaymentServiceInterface> paymentMethods){
        this.paymentMethods = paymentMethods;
    }

    public void processpayment(String choice, double amount){
        PaymentServiceInterface selectedMethod = paymentMethods.get(choice.toLowerCase());

        //validation check
        if(selectedMethod != null){
            selectedMethod.payment(amount);
        }else{
            System.out.println("Invalid Payment Method :" + choice);
        }
    }

}
