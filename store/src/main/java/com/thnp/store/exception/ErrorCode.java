package com.thnp.store.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(90000, "Uncategorized error", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_KEY(90001, "Invalid message key", HttpStatus.BAD_REQUEST),
    // Authenticated and Authorized
    UNAUTHENTICATED(80000, "Unauthenticated", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(80001, "You don't have permission", HttpStatus.FORBIDDEN),
    INVALID_SIGNATURE(80002, "Invalid signature", HttpStatus.UNAUTHORIZED),
    INVALID_TOKEN(80003, "Invalid token", HttpStatus.UNAUTHORIZED),
    // For user entity
    USER_USERNAME_EXISTED(10000, "Username existed", HttpStatus.BAD_REQUEST),
    USER_CAN_NOT_FOUND(10001, "Can't found user", HttpStatus.NOT_FOUND),
    USER_INVALID_PASSWORD(10002, "Password must be at least {min} characters", HttpStatus.BAD_REQUEST),
    USER_INVALID_USERNAME(10003, "Username must be at least {min} characters", HttpStatus.BAD_REQUEST),
    USER_INVALID_PHONE(10004, "Phone must be {max} characters", HttpStatus.BAD_REQUEST),
    USER_PHONE_EXISTED(10005, "Phone existed", HttpStatus.BAD_REQUEST),
    USER_EMAIL_EXISTED(10006, "Email existed", HttpStatus.BAD_REQUEST),
    USER_INVALID_DAY_OF_BIRTH(10007, "You must be at least {min} age", HttpStatus.BAD_REQUEST);

    int code;
    String message;
    HttpStatusCode statusCode;

    ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }
}
