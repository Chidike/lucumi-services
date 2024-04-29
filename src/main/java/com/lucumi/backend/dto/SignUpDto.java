package com.lucumi.backend.dto;

public record SignUpDto (String firstName, String lastName, String login, char[] password) {
}
