package FunctionnalInterface;

import lombok.Value;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _BiConsumer {

    public static void main(String[] args) {

        greetCustomerConsumer.accept(new Customer("Anass","888"),true);

        greetCustomerConsumer.accept(new Customer("Anass","888"),false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumer = (customer, showPhoneNumber) ->
            System.out.println("Hello "
                    + customer.name
                    + ", thanks for registration phone number " +
                    (showPhoneNumber ?  customer.phoneNumber : "********"));

    @Value
    static class Customer {
        private final String name;
        private final String phoneNumber;
    }
}
