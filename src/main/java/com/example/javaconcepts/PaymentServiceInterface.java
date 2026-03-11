package com.example.javaconcepts;
// This is an interface for all payment services. each payment method implements this interface
//an interface provides full abstraction in java, enabling multiple inheritance by allowing multiple classes to share the same set of behaviour
//it tell the child classes what they must do but not how to do it.each of the child class must implement this interface signature
public interface PaymentServiceInterface {
    void payment(double amount);
}
