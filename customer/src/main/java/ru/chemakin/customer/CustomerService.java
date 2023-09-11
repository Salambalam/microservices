package ru.chemakin.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService() {
    public void registration(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
    }
}
