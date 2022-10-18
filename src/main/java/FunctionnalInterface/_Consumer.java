package FunctionnalInterface;

import lombok.Value;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        //Normal Java Function
        greetCustomer(new Customer("Maria", "911"));

        // Consumer Functional Interface
        greetCustomerConsumer.accept(new Customer("Floky", "999"));
    }

    //Normal Java Function
    static void greetCustomer(Customer customer){
        System.out.println("Hello "
                + customer.name
                + ", thanks for registration phone number "
                + customer.phoneNumber);
    }

    // Consumer Functional Interface
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello "
            + customer.name
            + ", thanks for registration phone number "
            + customer.phoneNumber);


    @Value
    static class Customer {
        private final String name;
        private final String phoneNumber;
    }


}
