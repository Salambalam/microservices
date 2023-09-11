package ru.chemakin.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
